import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in array");
        int[] arr = new int[10];
        for(int i = 0; i < 10; i ++)
            arr[i] = input.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean flag = false;
        System.out.println("enter value to be found");
        int target = input.nextInt();
        int j = 0;
        while(true & j < arr.length) {
            mid = (start + end)/2;
            if (arr[start] == target | arr[end] == target | arr[mid] == target)
                flag = true;
            else if (target > arr[mid])
                start = mid;
            else
                end = mid;
            if(flag)
                break;
            j++;
        }
        if(flag)
            System.out.println("Yahoo...found it");
        else
            System.out.println("Oops, not found");
    }
}
