// wap a program to recursive sum of digits.

#include <stdio.h>

int sumOfDigits(long long n)
{
    if (n == 0)
        return 0;

    return (n % 10) + sumOfDigits(n / 10);
}

int main()
{
    long long n;

    printf("Enter a number: ");
    scanf("%lld", &n);

    // Handle negative numbers
    if (n < 0)
        n = -n;

    printf("Sum of digits = %d\n", sumOfDigits(n));

    return 0;
}