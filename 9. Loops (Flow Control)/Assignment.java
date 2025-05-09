import java.util.Scanner;

public class Assignment {
    public static void main(String args[]){

//Question 1 : How many times 'Hello' is printed?
    /*
    for(int i=0; i<5; i++) {
        System.out.println("Hello");    // 2 times
        i+=2;
    }*/

//Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
   /*
   Scanner scan = new Scanner(System.in);
   int evenSum = 0;
   int oddSum = 0;
   int choice;
   
   do{
        System.out.print("Enter your number : ");
        int number = scan.nextInt();

        if(number%2 == 0){
            evenSum += number;
        }else{
            oddSum += number;
        }
        System.out.print("To continue press 1 , to stop press 0 : ");
        choice = scan.nextInt();

   }while(choice == 1);

    System.out.println("The sum of even number : " + evenSum);
    System.out.println("The sum of odd number : " + oddSum);
    scan.close();
    */

//Question 3 : Write a program to find the factorial of any number entered by the user
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a positive number : ");
    int number = scan.nextInt();

    int fact = 1;

    if(number == 0 || number == 1){
        System.out.println("Factorial of " + number + " : " + fact);
    }else{
        for(int i=number; i>0; i--){
            fact *= i;
        }
        System.out.println("Factorial of " + number + " : " + fact);

    }
    */

//Question 4 : Write a program to print the multiplication table of a number N, entered by the user
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a positive number : ");
    int number = scan.nextInt();
    
    for(int i=1; i<=10; i++){
        System.out.println(number + " * " + i +" = " + (number*i));
    }
    */

    }
}