public class FastExponentiation{
    public static void main(String args[]){

        System.out.println("3^5 : " + fastExpo(3,5));

    }
    public static int fastExpo(int a, int b){
        int ans = 1;

        while(b>0){
            if((b & 1)!=0){
                ans = ans * a;
            }
            a = a*a;
            b = b>>1;
        }
        return ans;
    }
}