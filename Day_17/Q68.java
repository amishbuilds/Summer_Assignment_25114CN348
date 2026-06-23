package Summer_Assignment_25114CN348.Day_17;

import java.util.HashSet;

public class Q68 {
     public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        System.out.print("Common Elements: ");

        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
