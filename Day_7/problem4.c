// wap a program to recursive reverse number.

#include <stdio.h>

long long reverseNum(long long n, long long rev)
{
    if (n == 0)
        return rev;

    return reverseNum(n / 10, rev * 10 + (n % 10));
}

int main()
{
    long long n;

    printf("Enter a number: ");
    scanf("%lld", &n);

    if (n < 0)
    {
        printf("Reversed number = -%lld\n", reverseNum(-n, 0));
    }
    else
    {
        printf("Reversed number = %lld\n", reverseNum(n, 0));
    }

    return 0;
}