package Summer_Assignment_25114CN348.Day_16;

import java.util.HashMap;

public class Q62 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 2, 5, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int element = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                element = key;
            }
        }

        System.out.println("Maximum Frequency Element: " + element);
    }
}
