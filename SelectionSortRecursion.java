import java.util.Scanner;
import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of elements and values ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));
        SelectionRecursion(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionRecursion(int[] arr, int index) {
        if (index == 0)
            return;
        int i = Max(arr, index);
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
        SelectionRecursion(arr, index -1);
    }

    public static int Max(int[] arr, int index) {
        int max = 0;
        for(int i = 0; i <= index; i++) {
            if(arr[i] > arr[max])
                max = i;
        }
        return max;
    }
}