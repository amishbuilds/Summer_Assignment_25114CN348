 package Summer_Assignment_25114CN348.Day_11;

import java.util.Scanner;

public class Q42 {
    static int findMaximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Maximum = " + findMaximum(a, b));
    }
}
