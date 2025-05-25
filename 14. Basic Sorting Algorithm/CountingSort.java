public class CountingSort{
    public static void main(String args[]){

        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArray(arr);
        
    }

    // Counting Sort
    public static void countingSort(int arr[]){

        //Find largest value in the given array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
           largest = Math.max(largest, arr[i]);
        }

        int freqArr[] = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            freqArr[arr[i]]++;
        }

        //Insertion based on its frequency
        int j=0;
        for(int i=0; i<freqArr.length; i++){
            while(freqArr[i] >0){
                arr[j] = i;
                j++;
                freqArr[i]--;
            }
        }
    }

    // Print array---------
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