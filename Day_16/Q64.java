package Summer_Assignment_25114CN348.Day_16;

import java.util.LinkedHashSet;

public class Q64 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Array after removing duplicates: ");

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
