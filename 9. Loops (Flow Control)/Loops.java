import java.util.Scanner;

public class Loops {
    public static void main(String args[]){

// Loop (Repeat) --------------------------------
    // 1. while loop
    // 2. for loop
    // 3. do-while loop

    // while loop -----------------------------------
    /*
    while (condition) {
       do something -> if condition = true
    }*/
    
    //Example
    /*
    int i =1;
    while(i<=10){
        System.out.println(i+".   Hello DevX");
        i++;
    }
    */

    //Print number from 1 to 10
    /*
    int number = 1;
    while(number <= 10){
        System.out.println(number);
        number++;
    }
    */

    //Print number from 1 to n
    /*
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the value of n : ");
    int n = scan.nextInt();
    int counter = 1;

    while(counter <= n){
        System.out.print(counter + " ");
        counter++;
    }
    */

    //Print sum of first n natural numbers
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a natural number : ");
    int number = scan.nextInt();

    int sum = 0;
    while(number > 0){
        sum += number;
        number--;
    }
    System.out.println("Total Sum : " + sum);
    */

    // for loop -----------------------------------
    /*
    for (initialization; condition; updation) {
        do something -> if condition = true
    }
    */

    //Example
    /*
    for(int i=1; i<=10; i++){
        System.out.println(i+ ". Hello DevX");
    }
    */

    //Print Square Pattern
    /*
    for(int i = 1; i<=4; i++){
        System.out.println("* * * *");
    }
    */

    //Print Reverse of a number
    /*
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter any number : ");

    int number = scan.nextInt();

    int result=0;
    while(number!=0){
        int rem = number % 10;
        result = (result * 10) + rem;
        number/=10;
    }
    System.out.println(result);
    */

    // do-while loop --------------------------------
    /* 
    do{
        do something -> condition = true (1st iteration allways run)
    }while(condition);
    */
   
   //Example
    int i = 1;
    do{
        System.out.print(i + " ");
        i++;
    }while (i <= 10);


    }
}