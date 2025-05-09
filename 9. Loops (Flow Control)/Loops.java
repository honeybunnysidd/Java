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
   /*
    int i = 1;
    do{
        System.out.print(i + " ");
        i++;
    }while (i <= 10);
    */

//Break Statement (To exit the loop) --------------------------------
    /*
    for(int i=1; i<=10;i++){
        if(i==3){
            break;
        }
        System.out.print(i + " ");
    }
    */

    // Keep entering numbers until user enters a multiple of 10.
    /*
    Scanner scan = new Scanner(System.in);
    while(true){
        System.out.print("Enter multiple of 10 : ");
        int number = scan.nextInt();
        if(number % 10 == 0){
        System.out.print(number + " is a multiple of 10");
            break;
        }
    }
    */

// continue statement (to skip an iteration) --------------------------------
    
    //Example
    /*
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue;
        }
        System.out.println(i);
    }
    */
    
    // Display all numbers entered by user except multiples of 10.
    /*
    Scanner scan = new Scanner(System.in);
    do {
        System.out.print("Enter your number : ");
        int number = scan.nextInt();

        if(number % 10 == 0 ){
            continue;
        }
        System.out.println(number + " was your number");
    }while(true);
    */

    // Check if a number is Prime or Not.
    /*
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter any number : ");
    int number = scan.nextInt();
    String isPrime = "";

    if(number<=1){
        isPrime = "The given number " + number + " is not Prime";

    }else if(number == 2){
        isPrime = "The given number " + number + " is Prime";
    }else{
        boolean flag = true;
        for(int i=2; i<= number/2; i++){
        if(number % i == 0){
            flag = false;
            break;
        }
       } 
        if(flag){
            isPrime = "The given number " + number + " is Prime";
        }else{
            isPrime = "The given number " + number + " is not Prime";
        }
    }
    System.out.println(isPrime);
    scan.close();
    */

    }
}