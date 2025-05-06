
public class Variable{
    public static void main(String args[]){
//Variables in Java--------------------------------
        int a = 10;
        int b = 27;
        System.out.println("Sum = "+ (a+b));

//Change value of variable
        b =42;
        System.out.println("Sum = "+ (a+b));


// Data Types in Java--------------------------------

// Primitive (Already Exists)       //Non-Primitive(user define)
    // 1.byte                           1.String
    // 2.short                          2.Array
    // 3.char                           3.class
    // 4.boolean                        4.object
    // 5.int                            5.Interface
    // 6.long
    // 7.float
    // 8.double

    byte c = 8;
    System.out.println("c = "+ c);

    char ch = 'S';
    System.out.println("Character = "+ ch);

    boolean bool = true;
    System.out.println("Condition = "+ bool);

    float price = 10.50f;
    System.out.println("Price in decimal = "+ price);

    int number = 27;
    System.out.println("Whole/Integer value = "+ number);

// Size of data types --------------------------------
    // byte     -> 1byte -> [-128 to 127] = 256 (including -128 and 127)
    // short    -> 2byte -> [-32,768 to 32,767] 
    // char     -> 2byte -> ['a' to 'z' , 'A' to 'Z , '@','%'...]
    // boolean  -> 1byte -> [true or false]
    // int      -> 4byte -> [-2B to 2B]
    // long     -> 8byte -> [ int << long ]
    // float    -> 4byte -> [ _._ ]
    // double   -> 8byte -> [float << double]
    
    }
}