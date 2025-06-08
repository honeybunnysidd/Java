public class GetSet{
    public static void main(String args[]){

       System.out.println("Get the bit : " +  getIthBit(10,3));

       System.out.println("Set the bit : " +  setIthBit(10,2));
       
    }

    //Get the ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;

        if((n& bitMask) == 0){
            return 0;
        }
        return 1;
    }

    //Set the ith bit (means ith value => 1)
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask ;
    }

}