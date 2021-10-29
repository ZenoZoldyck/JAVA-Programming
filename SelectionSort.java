import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Time for some selection sort
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements and also the values");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int[] r; int t;
        System.out.println(Arrays.toString(arr));
        for(int i = n; i > 0; i--) {
            r = Max(arr, i);
            t = arr[i-1];
            arr[i-1] = r[0];
            arr[r[1]] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] Max(int[] arr,int a) {
        int[] max = new int[2];
        max[0] = arr[0];
        for(int i = 0; i < a; i++) {
            if(arr[i] > max[0]) {
                max[0] = arr[i];
                max[1] = i;
            }
        }
        return max;
    }
}
