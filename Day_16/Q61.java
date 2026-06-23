package Summer_Assignment_25114CN348.Day_16;

public class Q61 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}