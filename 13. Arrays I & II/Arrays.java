import java.util.*;

public class Arrays{

    public static void update(int arr[], int nonChangeable){
        for(int i=0; i<arr.length; i++){
            arr[i] += 1;
        }
        nonChangeable=10;
    }

    public static void main(String args[]){

    //Array
        //List of elements of the same type placed in a contiguous memory location

    // Operations in Array --------------------------------
        // 1. Create
        // 2. Input
        // 3. Output
        // 4. Update

        // Creating an Array (Multiple way) --------------------------------

        // dataType arrayName[] = new dataType[size];
        // int marks[] = new int[50];
                //OR
        // int numbers[] = { 1, 2, 3 };
        // String fruits[] = {"mango", "apple", "banana"};

        // Arrays - Input, Output, Update --------------------------------
        /*
        int arr[]= new int[3];
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        arr[0] = scan.nextInt();
        System.out.print("Enter your number 2 : ");
        arr[1] = scan.nextInt();
        System.out.print("Enter your number 3 : ");
        arr[2] = scan.nextInt();

        //Update
        arr[2] = 100;

        //Output
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        */

        //Arrays as Function Arguments --------------------------------
            //Passing array as an argument -> Pass by reference / not pass by value
        
        /*
        int marks[] = {78, 96, 42};
        int nonChangeable = 0;
        update(marks, nonChangeable);

        System.out.println(nonChangeable);  //Variables value not changed -> pass by value

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");  //Array values changed -> pass by reference
        }
        */
       

    }
}