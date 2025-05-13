public class Pattern{

    //Print Hollow Rectangle Pattern
    public static void hollow_Rectangle(int rows, int cols){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || j==1 || i==rows || j==cols){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Inverted & Roatated Half-Pyramid
    public static void invHalfPyramid(int rows){
        for(int i=1; i<=rows; i++){
                //Spaces
                for(int j=1; j<=rows-i; j++){
                    System.out.print("  ");
                }
                //Stars
                for(int star=1; star<=i; star++){
                    System.out.print("* ");
                }
            System.out.println();
        }
    }

    //Inverted Half-Pyramid with Numbers
    public static void invHalfPyramidNumber(int rows){
        for(int i=1; i<=rows; i++){
            for(int number=1; number<=rows-i+1; number++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
        
    public static void main(String args[]){

        //Print Hollow Rectangle Pattern
        //hollow_Rectangle(8,20);

        //Inverted & Roatated Half-Pyramid
        //invHalfPyramid(5);

        //Inverted Half-Pyramid with Numbers
        //invHalfPyramidNumber(7);
       
    }
}