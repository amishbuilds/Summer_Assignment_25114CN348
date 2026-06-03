// wap a program to check Armstrong number.

#include <stdio.h>

int main()
{
    int num, originalNum, remainder, result = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    originalNum = num;

    while (num != 0)
    {
        remainder = num % 10;
        result += remainder * remainder * remainder;
        num /= 10;
    }

    if (result == originalNum)
        printf("%d is an Armstrong Number.\n", originalNum);
    else
        printf("%d is not an Armstrong Number.\n", originalNum);

    return 0;
}