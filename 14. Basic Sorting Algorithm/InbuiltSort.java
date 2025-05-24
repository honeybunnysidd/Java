import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort{
    public static void main(String args[]){

        int arr[] = { 5, 4, 1, 3, 2 };
        //Asc. Order
        // Arrays.sort(arr);
        Arrays.sort(arr, 0 , 3);  //Index based
        printArray(arr);

        //Desc. Order
        Integer arr1[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr1, Collections.reverseOrder());
        printArray(arr1);        
    }

    // Print array ---
    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    // Print array ---
    public static void printArray(Integer arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
}