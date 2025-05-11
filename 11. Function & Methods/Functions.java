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

   //Swapping of two numbers
   public static void swapping(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.print("a = " + a + " b = " + b );
   }

   //Factorial of a number
   public static int factorial(int n){
    int fact = 1;

    if(n==0 || n==11){
        return fact;
    }else{

    for(int i=1; i<=n; i++){
        fact*=i;
    }
    return fact;
    }
   }

    public static void main(String arg[]){
        
        helloDev();     //Call the function

        //Sum of a & b
        /*
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scan.nextInt();

        System.out.print("Enter b: ");
        int b = scan.nextInt();

        int sum = sum(a, b);  //arguments
        System.out.print("Sum = " + sum);
        */

        //Swapping of two numbers
        /*
        int a= 10;
        int b = 27;
        swapping(a, b);
        */

        //Factorial of a number
        /*
        int n = 7;
        int factorial = factorial(n);
        System.out.print(n+"! = " + factorial);
        */

    }
}