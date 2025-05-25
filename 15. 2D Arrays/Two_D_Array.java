import java.util.Scanner;

public class Two_D_Array{
    public static void main(String args[]){

    // Creating 2D Arrays --------------------------------

        int matrix[][] = new int[2][2];
        int rows = matrix.length, cols = matrix[0].length;

        System.out.println("rows : " + rows);
        System.out.println("columns : " + cols);

    //Taking input in 2D Array-------------------------
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }

    //Print 2D Array-----------------------
        print2Darray(matrix);

        
    }

    //Print 2D Array
    public static void print2Darray(int arr[][]){
        int rows = arr.length, cols = arr[0].length;
        for(int i=0; i<rows; i++){  //row
            for(int j=0; j<cols; j++){  //cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}