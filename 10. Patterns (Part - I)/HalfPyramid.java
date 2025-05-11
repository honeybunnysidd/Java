public class HalfPyramid{
    public static void main(String args[]){

        /*
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5 
        */

        int row = 5;
        for(int line = 1; line<=row; line++){
            
            for(int number=1; number<=line; number++){
                System.out.print(number +" ");
            }
            System.out.println();
        }   

        System.out.println("---------------------");

        //Print Character Pattern
        int n = 6;
        char ch = 'A';
        for(int line=1; line<=n; line++){
            for(int j=1; j<=line; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}