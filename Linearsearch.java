import java.util.Scanner;
public class Linearsearch {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the length of the array");
      int len = in.nextInt();
      int[] arr = new int[len];
      System.out.println("Enter the elements of the array");
      for (int i = 0; i < len; i++) {
          arr[i] = in.nextInt();
      }
      System.out.println("Enter the value to be found");
      int key = in.nextInt();
      LinearSearch(arr, key);
    }
    
    public static void LinearSearch(int[] arr, int key) {
        int i;
        for(i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
        if (i == arr.length) {
                System.out.println("Element not found");
        }        
    }
}