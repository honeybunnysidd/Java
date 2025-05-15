public class BinarySearch{
    public static void main(String args[]){
    
     //Binary Search -----------------------
        //Prerequisites -> Sorted Array
        /*
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = binarySearch(number, key);

        if(index==-1){
            System.out.println("Key not found!");
        }else{
            System.out.println("The key " + key +" is on index number " + index);
        }
        */

        //Reverse an Array
        /*
        int number[] = {2,4,6,8,10,12,14,16};
        reverse(number);
        */

        //Pair in Array
        /*
        int number[] = {2,4,6,8,10};
        pairInArray(number);
        */

        //Print Sub Arrays
        /*
        int number[] = {2,4,6,8,10};
        printPairs(number);
        */

    }

    //Binary Search -----------------------
    public static int binarySearch(int arr[], int key){

        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    //Reverse an Array -----------------------
    public static void reverse(int arr[]){
        int first =0, end = arr.length-1;

        while(first<end){
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;

            first++;
            end--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    // Pairs in Array
    public static void pairInArray(int arr[]){
        int totalPair =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+", " + arr[j]+") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total no. of pairs: " + totalPair);
    }

    //Print Sub-Arrays
    public static void printPairs(int arr[]) {
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}