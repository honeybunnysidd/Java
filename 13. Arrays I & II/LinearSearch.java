public class LinearSearch{

    public static int linerSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
             return i;  
            }
        }
        return -1;  //item not found
    }

    public static void main(String args[]){

    // Linear search --------------------------------

    int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 7;

    System.out.println("Index of " + key + " is " + linerSearch(number, key));
    
    
    }
}