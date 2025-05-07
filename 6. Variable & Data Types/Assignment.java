import java.util.Scanner;

public class Assignment {
    public static void main(String args[]){

// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your English marks : ");
    int eng = scan.nextInt();

    System.out.print("Enter your Maths marks : ");
    int math = scan.nextInt();

    System.out.print("Enter your Science marks : ");
    int science = scan.nextInt();

    float avg = (float)(eng + math + science)/3;

    System.out.println("Average = " + avg);

    scan.close();
    */

//Question 2: In a program, input the side of a square. You have to output the area of the square
    /*
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter side of square in cm : ");

    int side = scan.nextInt();

    int areaOfSquare = side * side;

    System.out.println("Area of Square : " + areaOfSquare + " sq units");
    
    scan.close();
    */

/* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser.
    You have to output the total cost of the items back to the user as their bill.
    (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
    /*
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter cost of Pencil : ");
    float pencil = scan.nextFloat();

    System.out.print("Enter cost of Pen : ");
    float pen = scan.nextFloat();

    System.out.print("Enter cost of eraser : ");
    float eraser = scan.nextFloat();

    float bill = pencil + pen + eraser;
    System.out.println("Your bill : " + bill);

    float gstBill = bill + (bill * 0.18f);
    System.out.println("Your GST Bill : " + gstBill);

    scan.close();
    */

// Question 4: What will be the type of result in the following Java code?
    /*
    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;
    double result = (f * b) + (i % c) + (d * s); // double type -> type conversion
    System.out.println(result);
    */

// Question 5: (Advanced) Will the following statement give any error in Java?
    
    int $ = 27;  //Valid
    System.out.println("int $ = 27 is valid in Java");

    }
}