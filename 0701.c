#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void gugu(int x);
int sum(int x);
void oddeven(int x);
int calc(int x, int y, char ch);
int main()
{
	int x = 10, y = 20;
	char ch;
	int ans;

	printf("Input : ");
	scanf("%d", &x);
	gugu(x);
	printf("Input : ");
	scanf("%d", &x);
	ans=sum(x);
	printf("1부터 %d까지의 합은 %d이다.\n", x, ans);
	printf("Input : ");
	scanf("%d", &x);
	
	oddeven(x);
	printf("Input : ");
	scanf("%d %c %d", &x, &ch, &y);
	ans = calc(x, y, ch);
	printf("%d %c %d = %d\n", x, ch, y, ans);
	
	

	
	return 0;
}

void gugu(int x)
{
	int i;
	for (i = 1; i < 10; i++) {
		printf("%d * %d = %d\n", x, i, x*i);
	}
}
int sum(int x) {
	int i;
	int sum = 0;
	for (i = 1; i <= x; i++) {
		sum += i;
	}
	return sum;
}
void oddeven(int x) {
	if (x % 2 == 0) printf("%d(은)는 짝수입니다.\n", x);
	else printf("%d(은)는 홀수입니다.\n", x);
}
int calc(int x, int y, char ch) {
	int ans;
	switch (ch) {
	case '+':
		ans = x+y;
		break;
	case '-':
		ans = x-y;
		break;
	case '*':
		ans = x*y;
		break;
	case '/':
		ans = x/y;
		break;
	}
	return ans;
}