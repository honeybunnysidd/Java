public class InsertionSort{
    public static void main(String args[]){
        int arr[] = { 5, 4, 1, 3, 2 };
        InsertionSort(arr);
        printArray(arr);

    }

    //Inserstion Sort
    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length;i++){
            int key = arr[i];

            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] =arr[j];
                j--;
            }

            arr[j+1] = key;
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