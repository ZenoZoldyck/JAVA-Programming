import java.util.Scanner;

public class CountZerosRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you want to count the number of zeros of ");
        int num = in.nextInt();
        int ans = CountZero(num, 0);
        System.out.println("The number of zeros are " + ans);
    }

    public static int CountZero(int num, int count) {
        if(num == 0)
            return count;
        if(num % 10 == 0)
            return CountZero(num/10, count + 1);
        else
            return CountZero(num/10, count);
    }
}