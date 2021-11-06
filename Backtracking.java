import java.util.Scanner;

public class Backtracking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of grid");
        int num = in.nextInt();
        AllPossible("", 0, 0, num - 1);
    }

    public static void AllPossible(String a, int row, int col, int num) {
        if(row == num & col == num) {
            System.out.println(a);
            return;
        }
        else if(row == num)
            AllPossible(a + "R", row, col + 1, num);
        else if(col == num)
            AllPossible(a + "D", row + 1, col, num);
        else {
            AllPossible(a + "R", row, col + 1, num);
            AllPossible(a + "D", row + 1, col, num);
        }
    }
}