public class CountSetBit{
    public static void main(String args[]){
        System.out.println(countingSetBit(10));

    }

    public static int countingSetBit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) !=0){
                count++;
            }
           n =  n>>1;
        }
        return count;
}
}