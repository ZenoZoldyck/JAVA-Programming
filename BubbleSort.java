import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Bubble sort
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements and its values");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int swap; int t;
        System.out.println(Arrays.toString(arr));
        while(true) {
            swap = 0;
            for(int i = 0; i < n-1; i++) {
                if(arr[i] > arr[i + 1]) {
                    t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                    swap++;
                }
            }
            if (swap == 0)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
