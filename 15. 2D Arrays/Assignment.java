public class Assignment{
    public static void main(String args[]){
    //Question 1: Print the number of 7's that are in the 2d array.
        int array[][] = {{4,7,8},{8,8,7}};
        int key = 7;
        howManyTimes(array, key);

    // Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } }; // Output -> 18
        sum(nums);

    // Question 3 : Write a program to Find Transpose of a Matrix.
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        printMatrix(matrix);
        transposeMatrix(matrix);
    }

    //Question 1: Print the number of 7's that are in the 2d array.
    public static void howManyTimes(int array[][], int key){
        int count =0;

        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[0].length; col++){
                if(key==array[row][col]){
                    count++;
                }
            }
        }
        System.out.println(key + " : " + count + " times");
    }

    // Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
    public static void sum(int arr[][]){
        int sum = 0;
        for(int j=0;j<arr[0].length; j++){
            sum += arr[1][j];
        }
        System.out.println("The sum of 2nd row is  : " + sum);
    }

    // Question 3 : Write a program to Find Transpose of a Matrix.

    public static void transposeMatrix(int matrix[][]){
        int tmatrix[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                tmatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Print Transpose Matrix :");
        printMatrix(tmatrix);
    }

    //Print a Matrix
    public static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}