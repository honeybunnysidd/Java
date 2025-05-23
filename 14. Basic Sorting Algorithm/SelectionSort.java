public class SelectionSort{
    
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArray(arr);
    }

    //Selection Sort
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
           arr[smallest] = temp ;
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