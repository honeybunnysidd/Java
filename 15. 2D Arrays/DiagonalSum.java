public class DiagonalSum{
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println("Diagonal Sum : " + diagSum(matrix));
        System.out.println("Diagonal Sum : " + diagonalSum(matrix));
    }

    //Diagonal Sum (Brute Force - O(n^2))
    public static int diagSum(int matrix[][]){
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                //Primary Diagonal
                if(i==j){
                    sum += matrix[i][j];
                }

                //Secondary Diagonal
                if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    //Diagonal Sum (Optimise - O(n))
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){

            //Primary Diagonal
            sum += matrix[i][i];

            //Secondary Diagonal
            if(i!= matrix.length-1-i){ // skip center element here / count center element once
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

}