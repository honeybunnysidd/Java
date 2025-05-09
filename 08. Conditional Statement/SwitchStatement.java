import java.util.Scanner;

public class SwitchStatement{
    public static void main(String args[]){

// switch statement --------------------------------
    /*
    switch (variable){
        case 1 :
            do somenthing;
            break;
        case 2 :
            do somenthing;
            break;
        case 3 :
            do somenthing;
            break;
        case 4 :
            do somenthing;
             break;
        default: 
            do somenthing;
            break;
    }
    */

    //Example
    /*
    int number = 3;
    switch(number){
        case 1:
            System.out.println("Pizza lekar aao");
            break;
        case 2:
            System.out.println("Samosa lekar aao");
            break;
        case 3:
            System.out.println("Daru lekar aao");
            break;
        default:
            System.out.println("Kuch bhi le aao");
    }*/

   //Calculator-------------
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your 1st number : ");
    float num1 = scan.nextFloat();

    System.out.print("Enter your 2nd number : ");
    float num2 = scan.nextFloat();

    System.out.print("What operation do you want to perform (+  -  *  /  %) : ");
    char operator = scan.next().charAt(0);

    switch(operator){
        case '+' : System.out.println("Addition of " + num1 + " & " + num2 + " is " + (num1+num2));
                   break;
        case '-' : System.out.println("Substraction of " + num1 + " & " + num2 + " is " + (num1-num2));
                   break;
        case '*' : System.out.println("Multiplication of " + num1 + " & " + num2 + " is " + (num1*num2));
                   break;
        case '/' : System.out.println("Division of " + num1 + " & " + num2 + " is " + (num1/num2));
                   break;
        case '%' : System.out.println("Remainder of " + num1 + " & " + num2 + " is " + (num1%num2));
                   break;
        default : System.out.println("Please Choose valid operation");
    }
    
    }
}