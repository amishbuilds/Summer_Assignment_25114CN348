// wap a program to recursive fibonacci.

#include <stdio.h>

long long fibonacci(int n)
{
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main()
{
    int n;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    if (n <= 0)
    {
        printf("Number of terms must be positive.\n");
    }
    else if (n > 93)
    {
        printf("Series may overflow long long.\n");
    }
    else
    {
        printf("Fibonacci Series: ");
        for (int i = 0; i < n; i++)
        {
            printf("%lld ", fibonacci(i));
        }
    }

    return 0;
}