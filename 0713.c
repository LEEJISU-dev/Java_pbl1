#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct dualist {
	int data;
	struct dualist* Llink;
	struct dualist* Rlink;
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
	printf("\n");
	insertnode(15, 10);
	show();
	printf("\n");
	delnode(50);
	show();
	return 0;
}
node* inithead()
{
	node* tmp = (node*)malloc(sizeof(node));
	tmp->data = 0;
	tmp->Llink = NULL;
	tmp->Rlink = NULL;
	tail = tmp;
	return tmp;
}
void addnode(int data)
{
	node* newnode = (node*)malloc(sizeof(node));
	node* now = head;
	newnode->data = data;
	while (now->Rlink != NULL) now = now->Rlink;
	now->Rlink = newnode;
	newnode->Llink = now;
	newnode->Rlink = NULL;
	tail = newnode;
}
void insertnode(int data, int fdata)
{
	node* newnode = (node*)malloc(sizeof(node));
	node* now = head;
	newnode->data = data;
	while (now->data != fdata) now = now->Rlink;
	now->Rlink->Llink = newnode;
	newnode->Rlink = now->Rlink;
	now->Rlink = newnode;
	newnode->Llink = now;
}
void delnode(int data)
{
	node* delpre = head;
	node* del = NULL;
	while (delpre->Rlink->data != data) delpre = delpre->Rlink;
	del = delpre->Rlink;
	if (del->Rlink != NULL) {
		del->Rlink->Llink = delpre;
	}
	delpre->Rlink = del->Rlink;
	free(del);
}
void show()
{
	node* view = head->Rlink;
	while (view != NULL) {
		printf("%d\n", view->data);
		view = view->Rlink;
	}
}