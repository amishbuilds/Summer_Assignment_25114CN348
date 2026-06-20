package Summer_Assignment_25114CN348.Day_12;

public class Q46 {
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        int n = 153;

        if (isArmstrong(n))
            System.out.println(n + " is an Armstrong Number.");
        else
            System.out.println(n + " is not an Armstrong Number.");
    }
}        

