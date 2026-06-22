package Summer_Assignment_25114CN348.Day_13;

import java.util.Scanner;

public class Q49 {
    static void displayArray(int arr[]) {
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        displayArray(arr);
    }
}

