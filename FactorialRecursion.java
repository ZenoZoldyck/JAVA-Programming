import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        // Let's do binary Search using Recursion
        Scanner in = new Scanner(System.in);
        System.out.println("Which number factorial do you want ");
        int n = in.nextInt();
        int fact = Factorial(n);
        System.out.println("The factorial is " + fact);
    }

    public static int Factorial(int n) {
        if(n == 1)
            return 1;
        return n * Factorial(n-1);
    }
}