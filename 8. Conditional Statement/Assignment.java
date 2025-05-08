import java.util.Scanner;

public class Assignment{
    public static void main(String args[]){

//Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your number : ");
    int number = (int) (scan.nextFloat());

    String result = number>=0? "The Given number " + number + " is positive" : "The Given number " + number + " is negative";
    System.out.println(result);
    */
    
//Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100
//             and otherwise prints You don't have a fever.
    /*
    double temp = 103.5;

    if(temp > 100){
        System.out.println("You have fever");
    }else{
        System.out.println("You don't have fever");
    }
    */

//Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.
    /*
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter your week number (1-7) : ");
    int day = scan.nextInt();

    switch(day){
        case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        case 3: System.out.println("Wednesday"); break;
        case 4: System.out.println("Thursday"); break;
        case 5: System.out.println("Friday"); break;
        case 6: System.out.println("Saturday"); break;
        case 7: System.out.println("Sunday"); break;
        default: System.out.println("Please choose correct weekday from 1 to 7");
    }
    */

//Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.
        /*
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = scan.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }
        else if(year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is a not leap year");

        }
        */

    }
}