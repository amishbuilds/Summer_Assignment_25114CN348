package Summer_Assignment_25114CN348.Day_17;

public class Q65 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;

        for (int num : arr1) {
            merged[index++] = num;
        }

        for (int num : arr2) {
            merged[index++] = num;
        }

        System.out.print("Merged Array: ");

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
