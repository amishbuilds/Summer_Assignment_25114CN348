package Summer_Assignment_25114CN348.Day_12;

public class Q48 {
   static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int n = 28;

        if (isPerfect(n))
            System.out.println(n + " is a Perfect Number.");
        else
            System.out.println(n + " is not a Perfect Number.");
    }
}  

