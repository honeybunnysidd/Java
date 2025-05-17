public class BuySellStock{

    public static void buyAndSell(int arr[]){
        int profit =0, buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(buyPrice<arr[i]){ //profit
               int curProfit = arr[i]-buyPrice;
               profit = Math.max(curProfit, profit);
            }else{
                buyPrice = arr[i];
            }
        }
        System.out.println("The maximum Profit : " + profit);
    }

    public static void main(String args[]){

        int prices[] = {7,1,5,3,6,4};
        buyAndSell(prices);

    }
}