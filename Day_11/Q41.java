 package Summer_Assignment_25114CN348.Day_11;

import java.util.Scanner;

public class Q41 {
    static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + findSum(a, b));
    }
}

