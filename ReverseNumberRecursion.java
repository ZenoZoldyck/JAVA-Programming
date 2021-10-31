import java.util.Scanner;
import java.lang.Math;

public class ReverseNumberRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you want to reverse ");
        int num = in.nextInt();
        int n = num;
        int count = 0;
        while (true) {
            num = num/10;
            count = count + 1;
            if(num == 0)
                break;
        }
        int ans = ReverseRecursion(n, count - 1);
        System.out.println(ans);
    }

    public static int ReverseRecursion(int num, int count) {
        if(count == 0)
            return num;
        return (num % 10) * (int)Math.pow(10, count) + ReverseRecursion(num/10, count - 1);
    }
}