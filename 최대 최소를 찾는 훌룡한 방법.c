﻿#include<stdio.h>

int main()
{
	int n, num, min = 1000001, max = -1000001;
	scanf_s("%d", &n);
	for (int i = 1; i <= n; i++)
	{
		scanf_s("%d", &num);
		if (num > max)
			max = num;
		if (num < min)
			min = num;
	}
	printf("%d %d", min, max);

	return 0;
}