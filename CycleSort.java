import java.util.Scanner;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // Time for some cyclic sort
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements and also the values");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n;) {
            if(i + 1 == arr[i])
                i++;
            else
                Swap(arr, i, arr[i] - 1);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void Swap(int[] arr, int first, int second) {
        int t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;
    }
}
