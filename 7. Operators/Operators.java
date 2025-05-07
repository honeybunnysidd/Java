public class Operators {
    public static void main(String args[]){
        
// Operators : Symbol that tell compiler to perform some Operations
    // Types of Operators
        // 1. Arithmetic Operators
        // 2. Relational Operators
        // 3. Logical Operators
        // 4. Bitwise Operators
        // 5. Assignment Operators

    // 1. Arithmetic Operations (Binary / Unary) --------------------------------

        //  (+  -  *  /  %)   (Need two operand - Binary operator) 
        int A = 10, B = 27;
        System.out.println(A + B + 5);

        // ++ , --                => Unary operator (1 operands)
            // ++a : pre increment (Change value than Use)
            // --a : pre decrement (Change value than Use)
            /*
            int a = 10;
            int b = ++a;
            System.out.println(b);
            System.out.println(a);
            */

            // a++ : post increment (Use value than change)
            // a-- : post decrement (Use value than change)
            /*
            int c = 10;
            int d = c++;
            System.out.println(d);
            System.out.println(c);
            */ 
    
    // 2. Relational Operations --------------------------------
        // ==, !=,  <,  >,  <=, >=
        /*
        int a = 10, b = 5;
         System.out.println(a == b); // false
         System.out.println(a!= b); // true
         System.out.println(a < b); // false
         System.out.println(a > b); // true
         System.out.println(a <= b); // false
         System.out.println(a >= b); // true
        */

    // 3. Logical Operators --------------------------------
        // && (AND), || (OR), ! (NOT)
        /*
        int a = 10, b = 5;
        System.out.println(a > b && a > b); // ( && : gives true if both condition are true, otherwise false)
        System.out.println(a < b || a < b); // (|| : give true if either one or two condition is true, both false conditon only gives false)
        System.out.println(!(a > b));      //  (!  : true ->false , false ->true) 
        */
    
    // 5. Assignment Operators --------------------------------
        //   = , += , -= , *= , /= , %=
        /*
        int x = 10, y = 5;
        x += y;
        System.out.println(x); // 15
        x -= y;
        System.out.println(x); // 10
        x *= y;
        System.out.println(x); // 50
        x /= y;
        System.out.println(x); // 10
        x %= y;
        System.out.println(x); // 0
        */
    }
}