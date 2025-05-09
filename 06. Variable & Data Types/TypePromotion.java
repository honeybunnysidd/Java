public class TypePromotion{
    public static void main(String args[]){

// Type Promotion in Expression --------------------------------
    // 1. Java automatically promotes each byte, short or char operand to int when evaluating an expression.
    // 2. If one operand is long , float or double then whole expression is promoted to long, float or double respectively.

    byte a = 5;
    // a = a * 5;           //Expression give int type becuase of Type Promotion
    a = (byte) (a * 5);     //TypeCasting int to byte
    System.out.println(a);


    int b = 10;
    float c =20.25f;
    double d = 30;
    long e = 25;
    // int result = e + b + c + d;        // e + b + c + d give greatest type - double and result type is int 
    double result = e + b + c + d;         
    System.out.println(result);

    }
}