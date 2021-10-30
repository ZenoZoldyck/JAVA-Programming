import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        // Let's do some basic recursion
        Scanner in = new Scanner(System.in);
        System.out.println("How many natural numbers do you wanna print");
        int n = in.nextInt();
        NaturalNumbers(n);
    }

    public static void NaturalNumbers(int n) {
        if(n == 0)
            return;
        System.out.print(n + " ");
        NaturalNumbers(n-1);
    }
}