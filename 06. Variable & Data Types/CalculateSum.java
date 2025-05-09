import java.util.*;

public class CalculateSum {
    public static void main(String args[]){
       
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your 1st Number : ");
       float num1 = sc.nextFloat();

       System.out.print("Enter your 2nd Number : ");
       float num2 = sc.nextFloat();

       float sum = num1 + num2;

       System.out.println("Sum : " + sum);
    }
}