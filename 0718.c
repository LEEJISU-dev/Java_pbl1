#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct circlelist {
	int data;
	struct circlelist* link;
}node;

node* head = NULL;
node* tail = NULL;
node* inithead();
void addnode(int data);
void insertnode(int data, int fdata);
void delnode(int data);
void show();

int main()
{
	head = inithead();
	addnode(10);
	addnode(20);
	addnode(30);
	addnode(40);
	addnode(50);
	show();
	insertnode(5,0);
	insertnode(15, 10);
	show();
	delnode(50);
	show();
	return 0;
}

node* inithead()
{
	node* tmp = (node*)malloc(sizeof(node));
	tmp->data=0;
	tmp->link = NULL;
	return tmp;
}
void addnode(int data)
{
	node* newnode = (node*)malloc(sizeof(node));
	node* now = tail;
	
	if (head->link == NULL) {
		head->link = newnode;
		newnode->link = newnode;
		newnode->data = data;
	}else{
		newnode->link = now->link;
		now->link = newnode;
		newnode->data = data;
	}
	tail = newnode;
}
void insertnode(int data, int fdata)
{
	node* newnode = (node*)malloc(sizeof(node));
	node* now = head;
	while (now->data != fdata) now = now->link;
	newnode->data = data;
	if (now == head) {
		newnode->link = now->link;
		now->link = newnode;
		tail->link = newnode;
	}else{
		newnode->link = now->link;
		now->link = newnode;
	}
}
void delnode(int data)
{
	node* delpre = head;
	node* del = NULL;
	while (delpre->link->data != data) delpre = delpre->link;
	if (delpre == head) {
		del = delpre->link;
		delpre->link = del->link;
		tail->link = del->link;
	}
	else if (delpre->link == tail) {
		del = delpre->link;
		delpre->link = del->link;
		tail = delpre;
	}
	else{
		del = delpre->link;
		delpre->link = del->link;
	}
	free(del);
}
void show()
{
	node* view = head->link;
	while (view->link != head->link) {
		printf("%d\n", view->data);
		view = view->link;
		if (view == tail) {
			printf("%d\n", view->data);
		}
	}
}