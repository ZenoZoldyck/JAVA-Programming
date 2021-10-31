import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        // Let's do binary Search using Recursion
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements and the values");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println("Enter target value to be found");
        int target = in.nextInt();
        BinarySearch(arr,0, arr.length - 1, target);
    }

    public static void BinarySearch(int[] arr, int start, int end, int target) {
        int mid = (start + end)/2;
        if(arr[start] == target | arr[end] == target | arr[mid] == target) {
            System.out.println("Yahoo...found it");
            return;
        }
        if(start == end + 1 | end == start + 1) {
            System.out.println("Oops, not found");
            return;
        }
        if(arr[mid] > target) {
            end = mid;
            BinarySearch(arr, start, end, target);
        }
        else {
            start = mid;
            BinarySearch(arr, start, end, target);
        }
    }
}
