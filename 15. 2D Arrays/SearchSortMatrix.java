public class SearchSortMatrix {
    public static void main(String args[]) {

        int matrix[][] = { { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 27, 29, 37, 48 },
                            { 32, 33, 39, 50 }
                        };

        int key = 50;

        staircaseSearch2(matrix, key);
    }

    // Optimise approach - O(n+m) 
    public static void staircaseSearch(int matrix[][], int key){
        
        int rows=0 , cols = matrix[0].length-1;

        while(rows<matrix.length && cols>=0){
            if(matrix[rows][cols] == key){
                System.out.println("The given key " + key + " is found at matrix" +"[" +rows + "][" +cols +"]" );
                return;
            }else if(key>matrix[rows][cols]){
            rows++;
            }else{
            cols--;
            }
        }
        System.out.println("The given key " + key + " is not found");
    }

    //Same same but different
    public static void staircaseSearch2(int matrix[][] , int key){
        int rows = matrix.length-1 , cols=0;

        while(rows>=0 && cols <matrix.length){
            if(key == matrix[rows][cols]){
                System.out.println("The given key " + key + " is found at matrix" +"[" +rows + "][" +cols +"]" );
                return;
            }else if(key >matrix[rows][cols]){
                cols++;
            }else{
                rows--;
            }
        }
        System.out.println("The given key " + key + " is not found");

    }

}