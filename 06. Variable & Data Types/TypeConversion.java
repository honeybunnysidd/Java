public class TypeConversion{
    public static void main(String args[]){


// Type conversion (Widening Conversion or Implicit conversion(auto)) --------------------------------
    // Conversion happen when...
        // 1. type compatible
        // 2. destination type > source type
        // byte -> short -> int -> float -> -> long -> double

        int a = 10;
        long b = a;
        System.out.println(b);

        long c = 27;
        int d = c;
        System.out.println(d); //Error


    }
}