import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        // Let's do some Fibonacci recursion
        Scanner in = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want. Minimum value is n > 2 ");
        int n = in.nextInt();
        int ans = Fibonacci(n);
        System.out.println("The answer is " + ans);
    }

    public static int Fibonacci(int n) {
        if(n == 1 | n == 2)
            return n-1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
