public class Assignment{
    public static void main(String args[]){

   /* Question : Use the following sorting algorithms to sort an array in DESCENDING order :
        a. Bubble Sort
        b. Selection Sort
        c. Insertion Sort
        d. Counting Sort
    */
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // countingSort(arr);
        
        // printArray(arr);

    }

   // Bubble Sort
   public static void bubbleSort(int arr[]){
    
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j]<arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
   }
   }
   
   // Selection Sort
   public static void selectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int smallest = i;

        for(int j=i+1; j<arr.length; j++){
            if(arr[smallest]<arr[j]){
                smallest = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
    }
   }

   // Insertion Sort
   public static void insertionSort(int arr[]){
    
    for(int i=1; i<arr.length; i++){
        int key = arr[i];

        int j=i-1;        
        while(j>=0 && arr[j]<key){
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = key;
    }
   }

   // Counting Sort
   public static void countingSort(int arr[]){

    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        largest = Math.max(largest , arr[i]);
    }

    int freqArr[] = new int[largest+1];

    //find where to insert
    for(int i=0; i<arr.length; i++){
        freqArr[arr[i]]++;
    }
    
    //insert
    int j=0;
    for(int i=freqArr.length-1; i>=00; i--){
        
        while(freqArr[i] > 0){
            arr[j] = i;
            j++;
            freqArr[i]--;
        }
    }

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
}