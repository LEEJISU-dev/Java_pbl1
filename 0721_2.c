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

void showarr(int* arr);
int movetofront(int* arr, int find);
int movetofrontlist(node* n, int find);
int transpose(int* arr, int find);

int main()
{
	int arr[10] = { 9,1,2,3,4,5,7,10,6,8 };
	int fdata,i;
	int index = 0;
	head = inithead();
	addnode(9);
	addnode(1);
	addnode(2);
	addnode(3);
	addnode(4);
	addnode(5);
	addnode(7);
	addnode(10);
	addnode(6);
	addnode(8);
	show();
	printf("찾는 데이터 : ");
	scanf("%d", &fdata);
	index=movetofrontlist(head->link, fdata);
	printf("찾으시는 데이터 %d는 %d번째에 있습니다.\n", fdata, index);
	show();
	/*showarr(arr);
	printf("찾는 데이터 : ");
	scanf("%d", &fdata);
	index = movetofront(arr, fdata);
	//index = transpose(arr, fdata);
	printf("찾으시는 데이터 %d는 %d번째에 있습니다.\n", fdata, index);
	showarr(arr);*/


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
	for (i = 0; i < 10; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
}
int movetofront(int* arr, int find)
{
	int i,k;
	int index;
	for (i = 0; i < 10; i++) {
		if (find == arr[i]) {
			index = i;
			if (i == 0) break;
			else {
				for (k = index; k > 0; k--) {
					arr[k] = arr[k - 1];
				}
				arr[0] = find;
				break;
			}
		}
	}
	if (i == 10)
	{
		printf("찾는 데이터가 없습니다.\n");
		return -1;
	}
	else return index + 1;
}
int movetofrontlist(node* n, int find)
{
	node* nfind = n;
	node* ntmp = NULL;
	int cnt = 0;
	while (nfind != NULL) {
		if (nfind->data == find) {
			ntmp = nfind;
			while (ntmp->link != head) {
				ntmp->data = ntmp->prelink->data;
				ntmp = ntmp->prelink;
			}
			ntmp->data = find;
			return cnt+1;
		}
		nfind = nfind->link;
		cnt++;
	}
	if (nfind == NULL) {
		printf("찾는 데이터가 없습니다.\n");
		return -1;
	}
}
int transpose(int* arr, int find)
{
	int i;
	int index;
	for (i = 0; i < 10; i++) {
		if (find == arr[i]) {
			index = i;
			if (i == 0) break;
			else {
				arr[i] = arr[i - 1];
				arr[i - 1] = find;
				break;
			}
		}
	}
	if (i == 10) {
		printf("찾는 데이터가 없습니다.\n");
		return -1;
	}else return index + 1;
}