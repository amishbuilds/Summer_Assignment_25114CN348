package Summer_Assignment_25114CN348.Day_12;

public class Q47 {
    static void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int terms = 10;
        fibonacci(terms);
    }
}

