public class MaxSubArray{

    //Max Sub Array Sum -- Method I (Brute Force)
    public static void maxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum =0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                System.out.println("Sum is : " +sum);
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("The maximum sum of sub array is : "+ maxSum);
    }

    //Max Sub Array Sum -- Method II (Prefix Sum Approach)
    public static void  calculatePrefix(int arr[]){
        int prefixSum[] = new int[arr.length];

        prefixSum[0]= arr[0];
        for(int i=1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1] +  arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = i==0? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
            }
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        System.out.println("The maximum sum of sub array is : "+ maxSum);
    }

    //Max Sub Array Sum -- Method III (Kadane Algorithm)
    public static void kadaneAlgo(int arr[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        //Special case - All element are negative of given array
        for(int i=0; i<arr.length; i++){
            maxSum = Math.max(maxSum,arr[i]);
        }
        if(maxSum<0){
            System.out.println("Max Sum : " + maxSum);
            return;
        }

        // Element Negative and positive
        for(int i=0; i<arr.length; i++){
            curSum += arr[i];
            if(curSum<0){
                curSum = 0;
            }
            if(curSum>maxSum){
                maxSum = curSum;
            }
        }
        System.out.println("Max Sum : " + maxSum);

    }

    public static void main(String args[]){

        // int number[]= {1, -2, 6, -1, 3};

        //Method I (Brute Force)
        //maxSubArray(number);

        //Method II (Prefix Sum Approach)
        //calculatePrefix(number);

        //Method III (Kadane Algorithm) (if Sum  = negative(x) so we consider it 0)
        // int number[] = {-2,-3,4,-1,-2,1,5,-3};
        // int number[] = {-10,-2,-3,-4};  //Special case(all elements -ve)
        //kadaneAlgo(number);

    }
}