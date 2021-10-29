import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Time for some insertion sort
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements and also the values");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));
        int t;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
