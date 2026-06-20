 package Summer_Assignment_25114CN348.Day_11;

public class Q44 {
    static int findSum(int a, int b) {
    return a + b;
}

static int findMaximum(int a, int b) {
    return (a > b) ? a : b;
}

static boolean isPrime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

static long factorial(int n) {
    long fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}


}
