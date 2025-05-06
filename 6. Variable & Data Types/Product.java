import java.util.*;

public class Product{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your 1st Number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter your 2st Number : ");
        int num2 = scan.nextInt();

        int product = num1 * num2;

        System.out.println("Product of " + num1 + " and " + num2 + " = " + product);
    }
}