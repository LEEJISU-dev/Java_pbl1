#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <Windows.h>

typedef struct tree {
	int data;
	struct tree* par;
	struct tree* child;
	struct tree* bro;
}tree;

tree* root = NULL;
tree* initroot();
tree* addtree(tree* par,int data);
void showtree(tree* n);

int main()
{
	tree* newtree[11];
	root = initroot();
	
	return 0;
}

tree* initroot()
{
	tree* tmp = (tree*)malloc(sizeof(tree));
	tmp->par = NULL;
	tmp->child = NULL;
	tmp->bro = NULL;
	tmp->data = 10;
	return tmp;
}
tree* addtree(tree* par, int data)
{
	tree* newtree = (tree*)malloc(sizeof(tree));
	tree* now = par;
	if (now->child == NULL) {
		now->child = newtree;
		newtree->par = now;
	}else{
		now = now->child;
		while (now->bro != NULL) {
			now = now->bro;
		}
		now->bro = newtree;
		newtree->par = now->par;
	}
	newtree->child = NULL;
	newtree->bro = NULL;
	newtree->data = data;
	return newtree;
}
void showtree(tree* n)
{
	printf("%d ", n->data);
	if (n->child != NULL) showtree(n->child);
	if (n->bro != NULL) showtree(n->bro);
}