public class NestedLoops{
    public static void main(String args[]){

        //Nested Loops

        System.out.println("Star pattern");

        //Outer Loop -> Showing Total number of Rows
        for(int i=1; i<=6; i++){

            //Inner loop -> What to print in a row
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //Print Inverted-Star pattern
        int n=5;  // n= Total number of lines
        for(int line=1; line<=n; line++){
            
            for(int star=1; star<= (n-line+1);star++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        
    }
}