package Summer_Assignment_25114CN348.Day_21;

public class Q82 {
     public static void main(String[] args) {
        String str = "Hello";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed String = " + rev);
    }
}
