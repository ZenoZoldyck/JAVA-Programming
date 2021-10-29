import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        // Let's do some sorting
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array and the elements in it");
        int a = input.nextInt();
        int[] arr = new int[a];
        int t;
        for(int i = 0; i < a; i++)
            arr[i] = input.nextInt();
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < a; i++) {
            for(int j = i; j < a; j++) {
                if(arr[j] > arr[i]) {
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
