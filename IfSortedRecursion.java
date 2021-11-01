import java.util.Scanner;
import java.util.Arrays;

public class IfSortedRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you elements and its values ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));
        boolean flag = SortRecursion(arr, 0);
        if(flag)
            System.out.println("Great, your array is sorted in ascending order");
        else
            System.out.println("Oops, array not sorted in ascending order");
    }
    public static boolean SortRecursion(int[] arr, int i) {
        if(i == arr.length - 1)
            return true;
        if(arr[i] > arr[i + 1])
            return false;
        return SortRecursion(arr, i + 1);
    }
}