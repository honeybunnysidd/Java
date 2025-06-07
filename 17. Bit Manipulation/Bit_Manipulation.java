public class Bit_Manipulation{
    public static void main(String args[]){
     // Bit wise Operations --------------------------------
        // Binary And -> &
        // Binary Or -> |
        // Binary Xor -> ^
        // Binary One's complement -> ~
        // Binary Left Shift -> <<
        // Binary Right Shift -> >> 

        
     // Binary And (&) --------------------------------
     System.out.println(5 & 6);     //4

     // Binary Or (|) --------------------------------
     System.out.println(5 | 6);     //7

     // Binary Xor (^) Same bit -> 0 , differnt bit -> 1 --------------------------------
     System.out.println("5 ^ 6 : " + (5 ^ 6)); 

     // Binary One's complement (~) (NOT operator) --------------------------------
     System.out.println("~5 : " + (~5));

     // Binary Left Shift (<<)  --------------------------------
       // formula  (a<<b => a * b^2)
     System.out.println("5 << 2 : " + (5 << 2)); 

     // Binary Right Shift (>>)  --------------------------------
        // formula (a>>b => a / 2^b)
     System.out.println("6 >> 1 : " +  (6 >> 1));
     


    }
}