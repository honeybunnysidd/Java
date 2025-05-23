public class BubbleSort{

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

    public static void main(String args[]){

        //Sorting is the process of rearranging a collection of objects in a specific order.

        // Types of Basic Sorting Algorithms ---
            // 1. Bubble Sort               (TC -> O(n^2))
            // 2. Selection Sort            (TC -> O(n^2))
            // 3. Insertion Sort            (TC -> O(n^2))
            // 4. Counting Sort (Advanced)  (TC -> O(n logn))

        // Bubble Sort Example --------------------------------
            int arr[] = { 5, 4, 1, 3, 2 };
            bubbleSort(arr);
            printArray(arr);

    }

    public static void bubbleSort(int arr[]){
        boolean swap = false;

       for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){

                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swap = true;
                }
            }
            if(!swap){
                return;
            }

        }
    }
}