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

    //Floyd's Triangle
    public static void floydTriangle(int rows){
        int number = 1;
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number + "  ");
                number++;
            } 
            System.out.println();
        }
    }

    //0-1 Triangle
    public static void ZeroOneTriangle(int rows){
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                //What to print
                if((i+j) %2 ==0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    //Butterfly Pattern
    public static void butterfly(int rows){
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //Space
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print("  ");
            }
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         //outer loop
        for(int i=rows; i>=1; i--){
            //inner loop
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //Space
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print("  ");
            }
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //Solid Rhombus
    public static void solidRhombus(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Hollow Rhombus
    public static void hollowRhombus(int rows){
        //outer loop
        for(int i=1; i<=rows; i++){
            //spaces
            for(int j=1; j<=(rows-i); j++){
                System.out.print("  ");
            }
            //stars & spaces
            for(int j=1; j<=rows; j++){
                if(i==1 || j==1 || i==rows || j==rows){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Diamond Pattern
    public static void diamond(int rows){
        //outer loop
        for(int i=1; i<=rows; i++){

            //spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //2nd Half
        for(int i=rows; i>=1; i--){

            //spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
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
        // invHalfPyramidNumber(7);

        //Floyd's Triangle
        //floydTriangle(5);

        //0-1 Triangle
        //ZeroOneTriangle(5);

        //Butterfly Pattern
        //butterfly(4);

        //Solid Rhombus
        //solidRhombus(5);

        //Hollow Rhombus
        //hollowRhombus(5);

        //Diamond Pattern
        //diamond(5);
        
       
    }
}