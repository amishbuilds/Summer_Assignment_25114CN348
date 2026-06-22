package Summer_Assignment_25114CN348.Day_14;

import java.util.Scanner;

public class Q54 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int count = 0;

        for (int num : arr) {
            if (num == key)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
    
}
