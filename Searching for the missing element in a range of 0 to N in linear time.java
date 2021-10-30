import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
        // Time for some cyclic sort
        int[] arr = {1, 3, 2, 0, 5, 8, 7, 6};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length;) {
            if(i == arr[i] | arr.length - 1 < arr[i])
                i++;
            else
                Swap(arr, i, arr[i]);
        }
        int i;
        for(i = 0; i < arr.length; i++) {
            if(i != arr[i])
                break;
        }
        System.out.println("The missing value is " + i);
    }
    public static void Swap(int[] arr, int first, int second) {
        int t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;
    }
}
