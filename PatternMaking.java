import java.util.Scanner;

public class PatternMaking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you rows you want");
        int rows = in.nextInt();
        PatternRecursion(rows, 0);
    }

    public static void PatternRecursion(int rows, int columns) {
        if(rows == columns & rows != 0) {
            System.out.println();
            PatternRecursion(rows -1, 0);
        }
        if(rows > columns) {
            System.out.print("* ");
            PatternRecursion(rows, columns + 1);
        }
        else return;
    }
}