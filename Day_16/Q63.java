package Summer_Assignment_25114CN348.Day_16;

import java.util.HashSet;

public class Q63 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 3, 2};
        int target = 6;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair Found: " + complement + " + " + num);
                return;
            }

            set.add(num);
        }

        System.out.println("No Pair Found");
    }
}
