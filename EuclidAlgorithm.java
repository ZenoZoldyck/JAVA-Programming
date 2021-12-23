import java.util.Scanner;
public class EuclidAlgorithm {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the numbers for which you want to find the GCD such that a > b ");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = GCD(a, b);
        System.out.println("The GCD is " + ans);
    }
    
    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }
}