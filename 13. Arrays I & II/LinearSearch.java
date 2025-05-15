import java.util.*;

public class LinearSearch{

    public static int linerSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
             return i;  
            }
        }
        return -1;  //item not found
    }

   //Largest & Smallest Number
   public static void largestNumber(int arr[]){
    int largest = Integer.MIN_VALUE;  // -infinity
    int smallest = Integer.MAX_VALUE;   // +infinity

    for(int i=0; i<arr.length; i++){
        if(arr[i] >largest){
            largest = arr[i];
        }
        if(arr[i] < smallest){
            smallest = arr[i];
        }
    }
    System.out.println("The largest number is : " + largest);
    System.out.println("The smallest number is : " + smallest);
   }

    public static void main(String args[]){

    // Linear search --------------------------------
    /*
    int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 10;

    int index = linerSearch(number, key);

    if(index == -1){
        System.out.println("The key " + key + " is not found");
    }else{
        System.out.println("Index of " + key + " is " + index);
    }
    */

   //Largest and Smallest Number
   /*
   int number[] = { 1, 2, 6, 3, 5 };
   largestNumber(number);
   */   
    
    }
}