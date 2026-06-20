package Summer_Assignment_25114CN348.day_13;

import java.util.Scanner;

public class Q52 {
     static void countEvenOdd(int arr[]) {
        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Elements = " + even);
        System.out.println("Odd Elements = " + odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countEvenOdd(arr);
    }
}

