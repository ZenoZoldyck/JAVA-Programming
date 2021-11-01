import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class IndexFindingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you elements and its values ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
            arr[i] = in.nextInt();
        System.out.println("Please enter the target value ");
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a = IndexRecursion(arr, target, list, 0);
        System.out.println(a);
    }

    public static ArrayList<Integer> IndexRecursion(int[] arr, int target, ArrayList<Integer> list, int index) {
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        return IndexRecursion(arr, target, list, index + 1);
    }
}