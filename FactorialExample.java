import java.util.Scanner;
public class FactorialExample {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number for which you want the factorial ");
        int num = in.nextInt();
        int ans = Factorial(num);
        System.out.println("The factorial of " + num + " is " + ans);
    }
    
    public static int Factorial(int num) {
        if (num < 2) {
            return 1;
        }
        return num * Factorial(num - 1);
    }
}