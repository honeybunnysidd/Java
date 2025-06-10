public class GetSet{
    public static void main(String args[]){

       System.out.println("Get the bit : " +  getIthBit(10,3));

       System.out.println("Set the bit : " +  setIthBit(10,2));
       
       System.out.println("Clear the bit : " +  clearIthBit(10,1));
       
       System.out.println("Update the bit : " +  updateIthBit(10,2,1));

       System.out.println("Clear Multiple bits : " +  clearMultipleBits(15,2));

       System.out.println("Clear ith to jth bits : " +  clearIthToJthBits(10,2,4));


    }

    //Get the ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }

    //Set the ith bit (means ith value => 1)
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask ;
    }

    //Clear the ith bit (means ith value => 0)
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);

        return (n & bitMask) ;
    }

    //Update the ith bit
    public static int updateIthBit(int n, int i, int newBit){

        if(newBit == 0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    //Clear the ith bits (multiple i to last)
    public static int clearMultipleBits(int n, int i){
        int bitMask = (~0)<<i;

        return n & bitMask;
    }

    //Clear the ith bits (multiple i to j)
    public static int clearIthToJthBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;

        int bitMask = a|b;

        return n & bitMask;
        
    }


}