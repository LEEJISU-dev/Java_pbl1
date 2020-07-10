#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct stack {
	int data;
	struct stack* prelink; //이전
	struct stack* link;    //다음
}stack;
typedef struct queue {
	int data;
	struct queue* prelink; //이전
	struct queue* link;    //다음
}queue;

stack* headst = NULL;
stack* top = NULL;
stack* initheadst();
void push(int data);
int pop();


queue* head = NULL;
queue* front = NULL;
queue* rear = NULL;
queue* inithead();
void enqueue(int data);
int dequeue();
void show();

int main()
{
	int ans, sel = 1;
	int stnum = 1,qunum=1;
	head = inithead();
	headst = initheadst();
	while (sel != 0) {
		printf("Menu : 1. enqueue 2. dequeue 0. QUIT ");
		scanf("%d", &sel);
		switch (sel) {
		case 1:
			enqueue(qunum);
			push(stnum);
			stnum++;
			qunum++;
			break;
		case 2:
			dequeue();
			pop();
			if (stnum == 0) stnum = 0;
			else stnum--;
			break;
		}
		show();
	}
	return 0;
}
stack* initheadst()
{
	stack* tmp = (stack*)malloc(sizeof(stack));
	tmp->data = 0;
	tmp->prelink = NULL;
	tmp->link = NULL;
	return tmp; 
}
void push(int data)
{
	stack* newnode = (stack*)malloc(sizeof(stack));
	stack* Endnode = top;
	if (headst->link == NULL) {
		headst->link = newnode;
		newnode->prelink = head;
		newnode->link = NULL;
	}
	else {
		Endnode->link = newnode;
		newnode->prelink = Endnode;
		newnode->link = NULL;
	}
	newnode->data = data;
	top = newnode;
}
int pop()
{
	stack* del = top;
	int tmp;
	if (top == NULL) {
		printf("No more data\n");
		return;
	}
	tmp = del->data;
	del->prelink->link = NULL;
	if (del->prelink == headst) {
		top = NULL;
	}
	else {
		top = del->prelink;
	}
	free(del);
	return tmp;
}

queue* inithead()
{
	queue* tmp = (queue*)malloc(sizeof(queue));
	tmp->data = 0;
	tmp->prelink = NULL;
	tmp->link = NULL;
	return tmp;
}
void enqueue(int data)
{
	queue* newnode = (queue*)malloc(sizeof(queue));
	queue* Endnode = rear;
	if (head->link == NULL) {
		head->link = newnode;
		newnode->prelink = head;
		newnode->link = NULL;
		front = newnode;
	}else{
		Endnode->link = newnode;
		newnode->prelink = Endnode;
		newnode->link = NULL;
	}
	newnode->data = data;
	rear = newnode;
}
int dequeue()
{
	queue* del = front;
	int tmp; 
	if ((front == NULL) && (rear ==NULL)) {
		printf("No more data\n");
		return;
	}
	tmp = del->data;
	head->link=del->link;
	if (rear == front) {
		rear = NULL;
		front = NULL;
	}
	else {
		del->link->prelink = head;
		front = del->link;
	}
	free(del);
	return tmp;
}
void show() {
	queue* viewqu = rear;
	stack* viewst = top;
	if (viewqu == NULL) {
		return;
	}
	while ((viewqu != head) && (viewst!=headst)) {
		printf("stack : %3d queue : %3d\n", viewst->data,viewqu->data);
		viewst = viewst->prelink;
		viewqu = viewqu->prelink;
	}
}