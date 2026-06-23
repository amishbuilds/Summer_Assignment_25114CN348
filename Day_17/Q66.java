package Summer_Assignment_25114CN348.Day_17;

import java.util.LinkedHashSet;

public class Q66 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        LinkedHashSet<Integer> union = new LinkedHashSet<>();

        for (int num : arr1) {
            union.add(num);
        }

        for (int num : arr2) {
            union.add(num);
        }

        System.out.print("Union: ");

        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
