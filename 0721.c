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
void selectsortlsit2(node* n);
void bubblesortlist(node* n);
void insertsortlist(node* n);

void showarr(int* arr);
void selectsort(int* arr);
void bubblesort(int* arr);
void insertsort(int* arr);
void myinsertsort(int* arr);
void quicksort(int* arr,int start,int end);
void quicksortlist(node* start, node* end);
int main()
{
	int arr[8] = { 8,1,2,5,4,6,7,3 };
	head = inithead();
	//showarr(arr);
	//quicksort(arr, 0, 7);
	//showarr(arr);
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
	//selectsortlsit2(head);
	//bubblesortlist(head);
	//insertsortlist(head);
	quicksortlist(head->link, tail);
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
	}
	else {
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
void selectsortlsit2(node* n)
{
	node* std = n->link;
	node* cmp = NULL;
	node *btmp = NULL, *btmp1 = NULL;
	node *ntmp = NULL, *ntmp1 = NULL;
	node* tmpnode = NULL;
	int cnt = 0;
	int tmp;
	while (std != NULL) {
		cmp = std->link;
		while (cmp != NULL) {
			if (std->data > cmp->data) {
				if (cmp == tail) { //비교대상이 끝
					btmp = std->prelink;
					if (std->link != cmp) {
						ntmp = std->link;
						btmp1 = cmp->prelink;
					}
					//다리연결
					btmp->link = cmp;
					cmp->prelink = btmp;
					if (std->link != cmp) {
						cmp->link = ntmp;
						ntmp->prelink = cmp;
						btmp1->link = std;
						std->prelink = btmp1;
					}
					else {
						cmp->link = std;
						std->prelink = cmp;
					}
					std->link = NULL;
					cnt = 1;
				}
				else if (std->link == cmp) { //인접
					btmp = std->prelink;
					ntmp = cmp->link;
					//다리연결
					btmp->link = cmp;
					cmp->prelink = btmp;
					cmp->link = std;
					std->prelink = cmp;
					std->link = ntmp;
					ntmp->prelink = std;
					cnt = 0;
				}
				else { //No 인접
					   //사전작업
					btmp = std->prelink;
					ntmp = std->link;
					btmp1 = cmp->prelink;
					ntmp1 = cmp->link;
					//다리연결
					btmp->link = cmp;
					cmp->prelink = btmp;
					cmp->link = ntmp;
					ntmp->prelink = cmp;
					btmp1->link = std;
					std->prelink = btmp1;
					std->link = ntmp1;
					ntmp1->prelink = std;
					//바꾸기
					cnt = 0;
				}
				tmpnode = std;
				std = cmp;
				cmp = tmpnode;
				if (cnt == 1) tail = cmp;
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
		for (j = 0; j < 7 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
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
void insertsortlist(node* n)
{
	node* std = n->link->link;
	node* cmp = NULL;
	node* ntmp = NULL;
	int tmp;
	while (std != NULL) {
		cmp = head->link;
		while (cmp != std) {
			if (std->data < cmp->data) {
				tmp = std->data;
				ntmp = std;
				while (ntmp != cmp) {
					ntmp->data = ntmp->prelink->data;
					ntmp = ntmp->prelink;
				}
				cmp->data = tmp;
			}
			cmp = cmp->link;
		}
		std = std->link;
	}

}
void myinsertsort(int* arr)
{
	int i, j, k;
	int tmp;
	for (i = 1; i < 8; i++) {
		for (j = i - 1; j >= 0; j--) {
			if ((j == 0) && (arr[i] < arr[j])) {
				tmp = arr[i];
				for (k = i; k > j; k--) {
					arr[k] = arr[k - 1];
				}
				arr[j] = tmp;
			}
			else if (arr[i] > arr[j]) {
				tmp = arr[i];
				for (k = i; k > j + 1; k--) {
					arr[k] = arr[k - 1];
				}
				arr[j + 1] = tmp;
				break;
			}
			else {}
		}

	}
}
void quicksort(int* arr, int start, int end)
{
	int key = arr[start];
	int st = start;
	int ed = end;
	int tmp;

	if (st >= ed) return;
	while (st < ed) {
		while ((key > arr[st]) && (st <= ed)) st++;
		while ((key < arr[ed]) && (st <= ed)) ed--;
		if (st < ed) {
			tmp = arr[st];
			arr[st] = arr[ed];
			arr[ed] = tmp;
		}
	}
	quicksort(arr, start, st - 1); //전반부
	quicksort(arr, st + 1, end);   //후반부
}
void quicksortlist(node* start, node* end)
{
	int key = start->data;
	node* st = start;
	node* ed = end;
	int tmp;

	if ((st == ed) ||(st->prelink==ed) ||(ed->link==st)) return;
	while (st != ed) {
		while ((key > st->data) && (st != ed)) st=st->link;
		while ((key < ed->data) && (st != ed)) ed=ed->prelink;
		if (st != ed) {
			tmp = st->data;
			st->data = ed->data;
			ed->data = tmp;
		}
	}
	quicksortlist(start, st->prelink); //전반부
	quicksortlist(st->link, end);   //후반부
}