import java.util.Scanner;

public class Functions{

    //Syntax of Functions
    /*
    Access-Modifier returnType funcName(type param1, type param2){
    //Body
    return statement;  // return empty value (returnType -> void)
    }
    */
   
   //Example
   public static void helloDev(){
    System.out.println("Hello DevX");
    return;         // return empty value (returnType -> void)
   }

   //Sum of a & b
   public static int sum(int a, int b){  // parameters

    return a+b;  //return int value (returnType -> int)
   }

    public static void main(String arg[]){
        
        helloDev();     //Call the function

        //Sum of a & b
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scan.nextInt();

        System.out.print("Enter b: ");
        int b = scan.nextInt();

        int sum = sum(a, b);  //arguments
        System.out.print("Sum = " + sum);
    }
}