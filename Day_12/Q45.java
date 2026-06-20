package Summer_Assignment_25114CN348.Day_12;

public class Q45 {
          static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int n = 121;

        if (isPalindrome(n))
            System.out.println(n + " is a Palindrome.");
        else
            System.out.println(n + " is not a Palindrome.");
    }
}    

