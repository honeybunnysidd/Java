public class TypeCasting{
    public static void main(String args[]){


// Type Casting (Explicit or Narrowing Conversion -Java not allowed, we do it forcefully)--------------------------------
    // lossy Conversion ---loss of data

    float a = 27.10f;
    // int b = a;       //Type casting Error
    int b = (int) a;     //explicit converion with loss of data
    System.out.println(b);

    char ch = 's';
    int c = ch;  //Store its ASCII value (TypeConversion because it auto convert char to int)
    System.out.println(c);

    }
}