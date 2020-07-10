#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <Windows.h>

typedef struct list {
	int data;
	struct list* prelink;
	struct list* link;
}node;

node* head = NULL;
node* tail = NULL;
node* inithead();
void addnode(int data);
void show();
void selectsortlsit(node* n);
void selectsortlsit1(node* n);
void bubblesortlist(node* n);

void showarr(int* arr);
void selectsort(int* arr);
void bubblesort(int* arr);
void insertsort(int* arr);
void myinsertsort(int* arr);

int main()
{
	int arr[8] = { 8,1,2,5,4,6,7,3 };
	head = inithead();
	addnode(8);
	addnode(1);
	addnode(2);
	addnode(5);
	addnode(4);
	addnode(6);
	addnode(7);
	addnode(3);
	show();
	//selectsortlsit(head);
	selectsortlsit1(head);
	//bubblesortlist(head);
	show();
	return 0;
}

node* inithead()
{
	node* tmp = (node*)malloc(sizeof(node));
	tmp->data = 0;
	tmp->link = NULL;
	return tmp;
}
void addnode(int data)
{
	node* newnode = (node*)malloc(sizeof(node));
	node* now = tail;
	if (now == NULL) {
		head->link = newnode;
		newnode->prelink = head;
		newnode->link = NULL;
	}else{
		now->link = newnode;
		newnode->prelink = now;
		newnode->link = NULL;
	}
	tail = newnode;
	newnode->data = data;
}
void show()
{
	node* view = head->link;
	while (view != NULL) {
		printf("%d ", view->data);
		view = view->link;
	}
	printf("\n");
}


void showarr(int* arr)
{
	int i;
	for (i = 0; i < 8; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}
void selectsort(int* arr)
{
	int i, j;
	int tmp;
	for (i = 0; i < 8; i++) {
		for (j = i + 1; j < 8; j++) {
			if (arr[i] > arr[j]) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
}
void selectsortlsit(node* n)
{
	node* std = n->link;
	node* cmp = NULL;
	int tmp;
	while (std != NULL) {
		cmp = std->link;
		while (cmp != NULL) {
			if (std->data > cmp->data) {
				tmp = std->data;
				std->data = cmp->data;
				cmp->data = tmp;
			}
			cmp = cmp->link;
		}
		std = std->link;
	}
}
void selectsortlsit1(node* n)
{
	node* std = n->link;
	node* cmp = NULL;
	node* btmp = NULL;
	node* ntmp = NULL;
	node* tmpnode = NULL;
	int tmp;
	while (std != NULL) {
		cmp = std->link;
		while (cmp != NULL) {
			if (std->data > cmp->data) {
				//바꾸기전 사전 작업
				printf("사전작업\n");
				btmp = std->prelink;
				ntmp = cmp->link;
				show();
				Sleep(1000);
				//다리연결
				btmp->link = cmp;
				cmp->prelink = btmp;
				cmp->link = std;
				std->prelink = cmp;
				std->link = ntmp;
				ntmp->prelink = std;
				show();
				Sleep(1000);

				//바꾸기
				tmpnode = std;
				std = cmp;
				cmp = tmpnode;
				show();
				Sleep(1000);
			}
			cmp = cmp->link;
		}
		std = std->link;
	}
}
void bubblesort(int* arr)
{
	int i, j;
	int tmp;
	for (i = 0; i < 8; i++) {
		for (j = 0; j < 7-i; j++) {
			if (arr[j] > arr[j+1]) {
				tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
	}
}
void bubblesortlist(node* n)
{
	node* std = n->link;
	node* cmp = NULL;
	node* end = tail;
	int tmp;
	while (std != cmp) {
		cmp = std;
		while (cmp != end) {
			if (cmp->data > cmp->link->data) {
				tmp = cmp->data;
				cmp->data = cmp->link->data;
				cmp->link->data = tmp;
			}
			
			cmp = cmp->link;
		}
		end = cmp->prelink;
	}
}
void insertsort(int* arr)
{
	int i, j, k;
	int tmp;
	for (i = 1; i < 8; i++) {
		for (j = 0; j < i; j++) {
			if (arr[i] < arr[j]) {
				tmp = arr[i];
				for (k = i; k > j; k--) {
					arr[k] = arr[k - 1];
				}
				arr[j] = tmp;
			}
		}
		
	}
}
void myinsertsort(int* arr)
{
	int i, j, k;
	int tmp;
	for (i = 1; i < 8; i++) {
		for (j = i-1; j >= 0; j--) {
			if ((j == 0) && (arr[i] < arr[j])) {
				tmp = arr[i];
				for (k = i; k > j; k--) {
					arr[k] = arr[k - 1];
				}
				arr[j] = tmp;
			}else if(arr[i] > arr[j]){
				tmp = arr[i];
				for (k = i; k > j+1; k--) {
					arr[k] = arr[k - 1];
				}
				arr[j+1] = tmp;
				break;
			}
			else {}
		}

	}
}