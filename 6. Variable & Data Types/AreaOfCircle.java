import java.util.*;

public class AreaOfCircle{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        float radius = scan.nextFloat();

        float area = 3.14f * radius * radius;

        System.out.println("The area of circle with radius "+ radius + " = " + area);
    }
}