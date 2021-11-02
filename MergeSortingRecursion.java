import java.util.Scanner;
import java.util.Arrays;

public class MergeSortingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of elements and values ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++)
            arr[i] = in.nextInt();
        System.out.println(Arrays.toString(arr));
        int[] a = MergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static int[] MergeSort(int[] arr, int start, int end) {
        if(end == start) {
            int[] x = {arr[end]};
            return x;
        }
        int mid = (start + end)/2;
        int[] arr1 = MergeSort(arr, start, mid);
        int[] arr2 = MergeSort(arr, mid + 1, end);
        int c = (mid - start + 1) + (end - mid);
        int[] b = new int[c];
        int j = 0; int i = 0; int k = 0;
        while(true) {
            if(i == (mid - start + 1) | j == (end - mid))
                break;
            if(arr1[i] < arr2[j])
                b[k++] = arr1[i++];
            else
                b[k++] = arr2[j++];
        }
        if(i < (mid - start + 1)) {
            for(int r = k; r < c; r++)
                b[r] = arr1[i++];
        }
        else {
            for(int r = k; r < c; r++)
                b[r] = arr2[j++];
        }
        return b;
    }
}