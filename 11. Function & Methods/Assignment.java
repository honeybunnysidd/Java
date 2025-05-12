import java.util.Scanner;

public class Assignment{

    //Question 1 : Write a Java method to compute the average of three numbers.
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }

    //Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
                   // Also write a program to test your method.
    public static boolean isEven(int a){
        if(a%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    //Question 3 : Write a Java program to check if a number is a palindrome ( 121 is a palindrome, 321 is not)
    public static boolean palindrome(int n){
        int rev = 0, copy = n;
        while(n>0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if(rev == copy){
            return true;
        }
        return false;
    }

   //Question 5 : Write a Java method to compute the sum of the digits in an integer
    public static int sumOfDigit(int n){
        int sum = 0; 
        while(n>0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }


    public static void main(String args[]){
    
    //Question 1 : Write a Java method to compute the average of three numbers.
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your hindi marks : ");
    double hindi = scan.nextDouble();

    System.out.print("Enter your english marks : ");
    double eng = scan.nextDouble();

    System.out.print("Enter your math marks : ");
    double math = scan.nextDouble();

    System.out.println("Average is : " + average(hindi, eng, math));
    */

    //Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
                   // Also write a program to test your method.
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a positive number : ");
    int number = scan.nextInt();
    
    if(isEven(number)){
        System.out.println("The given number is even");
    }else{
        System.out.println("The given number is odd");
    }
    */

    //Question 3 : Write a Java program to check if a number is a palindrome ( 121 is a palindrome, 321 is not)
    /*
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a positive number : ");
    int number = scan.nextInt();

    if(palindrome(number)){
        System.out.println("The given number " + number + " is palindrome");
    }else{
        System.out.println("The given number " + number + " is not palindrome");
    }
    */

    /*Question 4 : READ & CODE EXERCISE
        Search about(Google) & use the following methods of the Math class in Java:
            a. Math.min( )
            b. Math.max( )
            c. Math.sqrt( )
            d. Math.pow( )
            e. Math.avg( )
            f. Math.abs( )
    */

   //Question 5 : Write a Java method to compute the sum of the digits in an integer
   /*
   Scanner scan = new Scanner(System.in);

   System.out.print("Enter a positive number : ");
   int number = scan.nextInt();

   System.out.println("Sum of all digits of " + number + " is " + sumOfDigit(number));
    */
        
    }
}