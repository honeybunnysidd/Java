public class Assignment{
    /*Question 1: Given an integer array nums, return true if any value appears at least twice in the array,
        and return false if every element is distinct.
        Example 1:
        Input: nums = [1, 2, 3, 1]
        Output: true
    */
   public static boolean containsDuplicate(int[] nums) {

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){

                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;

    }

    /*Question 2: There is an integer array nums sorted in ascending order (with distinct values).
        Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
        such that the resulting array is [nums[k],nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
        For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
        Given the array nums after the possible rotation and an integer target,
        return the index of target if it is in nums, or -1 if it is not in nums.
        You must write an algorithm with O(log n) runtime complexity
    */
   public static int returnTarget(int arr[], int target){

    //Binary Serach because array is sort
    int start = 0, end = arr.length-1;

    while(start<=end){
        int mid = (start + end)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]> target){
            end = mid -1;
        }else{
            start = mid+1;
        }
    }
    return -1;    
   }

   /*Question 3: You are given an array prices where prices[i] is the price of a given stock on the ith day.
        Return the maximum profit you can achieve from this transaction.
        If you cannot achieve any profit, return 0.
    */

   public static void buyAndSell(int arr[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i=0; i<arr.length; i++){
        if(buyPrice<arr[i]){ //isme profit hoga
            maxProfit = Math.max(maxProfit, buyPrice - arr[i] );
        }else{
            buyPrice = arr[i];
        }

    }

   }

   /*Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1,
        compute how much water it can trap after raining.
   */

    public static void trapWater(int arr[]){
        //Leftmax Boundary
        int leftMax[] = new int[arr.length];
        leftMax[0]= arr[0];

        for(int i=1; i<arr.length; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //Rightmax Boundary
        int rightMax[]  = new int[arr.length];

        rightMax[rightMax.length-1] = arr[arr.length-1];

        for(int i=arr.length-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trapWater = 0;
        for(int i=0; i<arr.length; i++){
           int waterLevel =  Math.min(leftMax[i],rightMax[i]);
           trapWater += waterLevel - arr[i];
        }
        System.out.println("Trap Water : " + trapWater);
    }

    /*Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
        such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        Notice that the solution set must not contain duplicate triplets.
    */
    public static void triplets(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] ==0 && i != j && j != k && i != k){
                    System.out.println("[" + arr[i]+ " " + arr[j] + " " +arr[k]+"]");
                    }
                }
            }
        }
    }
        

    public static void main(String args[]){

        //Question 1:
            //int nums[] = {1,2,3,1};
            //System.out.println(containsDuplicate(nums));

        //Question 2:
            //int nums[] = {4, 5, 6, 7, 0, 1, 2};
            //int target = 7;
            //System.out.println(returnTarget(nums, target));

        //Question 3:
            //int prices[] = {7,1,5,3,6,4};
            //buyAndSell(prices);
        
        //Question 4:
            //int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
            //trapWater(height);

        //Question 5:
        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplets(nums);



    }
}