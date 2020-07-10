#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct tree {
	char data[20];
	int level;
	struct tree* par;
	struct tree* bro;
	struct tree* chi;
}tree;

tree* root = NULL;
tree* initroot();
void addtree(tree* par, char* find);
tree* findtree(tree* par, char* find);
void showtree(tree* n);

int main()
{
	tree* newtree[15];
	int sel = 1;
	char find[20], fold[20];
	root = initroot();
	while (sel != 0) {
		printf("Menu : 1. New 2. Show 0. Quit ");
		scanf("%d", &sel);
		switch (sel) {
		case 1:
			printf("상위폴더이름 : ");
			scanf("%s", find);
			addtree(root, find);
			break;
		case 2:
			showtree(root);
			break;

		}
	}
	return 0;
}
tree* initroot()
{
	tree* tmp = (tree*)malloc(sizeof(tree));
	strcpy(tmp->data,"내문서");
	tmp->level = 0;
	tmp->par = NULL;
	tmp->chi = NULL;
	tmp->bro = NULL;
	return tmp;
}
void addtree(tree* par, char* find)
{
	tree* newtree = (tree*)malloc(sizeof(tree));
	tree* move = par;
	move = findtree(move, find);
	if (move == NULL) {
		printf("찾는 폴더가 없습니다\n");
		return;
	}
	printf("Find String : %s\n", move->data);
	printf("하위폴더이름 : ");
	scanf("%s", newtree->data);
	if (move->chi == NULL) {
		move->chi = newtree;
		newtree->par = move;
		newtree->level = move->level + 1;
	}
	else {
		move = move->chi;
		while (move->bro != NULL) {
			move = move->bro;
		}
		move->bro = newtree;
		newtree->par = move->par;
		newtree->level = move->level;
	}
	newtree->chi = NULL;
	newtree->bro = NULL;
}
tree* findtree(tree* par, char* find)
{
	tree* treefind=NULL;
	if (strcmp(par->data, find) == 0) return par;
	if (par->chi != NULL) {
		treefind= findtree(par->chi, find);
	}
	if (treefind != NULL) return treefind;
	if (par->bro != NULL) {
		treefind = findtree(par->bro, find);
	}
	if(treefind==NULL) return NULL;
	else return treefind;
}
void showtree(tree* n)
{
	int i;
	if(n==root)	printf("%s\n", n->data); //전위
	else {
		for (i = 0; i < n->level; i++) printf("  ");
		printf("- %s\n", n->data);
	}
	if (n->chi != NULL) showtree(n->chi);
	if (n->bro != NULL) showtree(n->bro);
}