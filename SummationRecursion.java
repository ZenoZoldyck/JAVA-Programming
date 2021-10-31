import java.util.Scanner;

public class SummationRecursion {
    public static void main(String[] args) {
        // Let's do binary Search using Recursion
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you want the sum of digits of ");
        int num = in.nextInt();
        int sum = SumRecursion(num);
        System.out.println("The sum of the digits is " + sum);
    }

    public static int SumRecursion(int num) {
        if(num == 0)
            return 0;
        return (num % 10) + SumRecursion(num/10);
    }
}