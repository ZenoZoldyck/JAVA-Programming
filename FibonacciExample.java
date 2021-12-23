import java.util.Scanner;
public class FibonacciExample {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter which number term you want in the fibonacci series ");
        int num = in.nextInt();
        int ans = Fibonacci(num);
        System.out.println("The answer is " + ans);
    }
    
    public static int Fibonacci(int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }
}