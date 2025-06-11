public class PowerOfTwo{
    public static void main(String args[]){

        System.out.println(powerOfTwo(16 ));
        
    }
    public static boolean powerOfTwo(int n){
        if((n & n-1) ==0){
            return true;
        }
        return false;
    }
}