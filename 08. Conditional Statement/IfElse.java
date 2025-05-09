import java.util.*;

public class IfElse{
    public static void main(String args[]){

// if-else statements -----------------------------------
    /*
    if (condition) {
        do something -> condition = true
    }else{
        do something -> condition = false
    }
    */

    //Example
    /*
    int age = 27;
    if (age >= 18) {
        System.out.println("Adult : Vote, Drive");
    } else {
        System.out.println("Not Adult");
    }
    */

    // Print the largest of 2 numbers
    /*
    int A = 1, B = 3;
    if(A>B){
        System.out.println(A + " is largest");
    }else{
        System.out.println(B + " is largest");
    }
    */

    // Print if number is odd or even number
    /*
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int num = (int) (scan.nextFloat());
    if(num%2 == 0) {
        System.out.println("The given number " + num + " is even");
    }else{
        System.out.println("The given number " + num + " is odd");
    }
    */

// else if statement --------------------------------
    /*
    if (condition) {
        do something -> condition = true
    } else if(condition2) {
        do something -> condition2 = true
    }else{
        do something -> condition or condition2 = false
    }
    */

    // Income Tax Calculator
    /*
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your Income per Annum : ");
    int income = (int) (scan.nextFloat());
    float tax;

    if(income < 500000){
        tax = income * 0.0f;
    }else if(income >= 500000 && income <= 1000000){
        tax = income * 0.2f;
    }else{
        tax = income * 0.3f;
    }
    System.out.println("Your tax : " + tax);
    */

    // Print the largest of 3 numbers
    /*
    int a = 1,  b = 3, c = 6;
    
    if(a>=b && a>=c){
        System.out.println("a is largest");
    }else if(b>=c){
        System.out.println("b is largest");
    }else{
        System.out.println("c is largest");
    }
    */

    }
}