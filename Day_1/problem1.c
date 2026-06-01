// wap a program to calculate sum of first N natural numbers

#include <stdio.h>

int main()
{
    int N;
    int sum;

    printf("Enter a positive integer: ");
    scanf("%d", &N);

    sum = N * (N + 1) / 2;

    printf("Sum of first %d natural numbers = %d\n", N, sum);

    return 0;
}