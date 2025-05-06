import java.util.*;

public class Input{
    public static void main(String args[]){

//  Input in java --------------------------------
// next         -> single word
// nextLine     -> Paragraph / line
// nextInt      -> int type / sc.nextInt()
// nextByte     -> byte type / sc.nextByte()
// nextFloat    -> float type / sc.nextFloat()
// nextDouble   -> double type / sc.nextDouble()
// nextBoolean  -> boolean type / sc.nextBoolean()
// nextShort    -> short type / sc.nextShort()
// nextLong     -> long type / sc.nextLong()

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your input(One Word) : ");
    String input = sc.next();
    System.out.println(input);

    Scanner sentence = new Scanner(System.in);
    System.out.print("Enter your input(Sentence) : ");
    String input1 = sentence.nextLine();
    System.out.println(input1);

    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter your Integer : ");
    int integer = sc1.nextInt();
    System.out.println(integer);

    Scanner sc2 = new Scanner(System.in);
    System.out.print("Enter your Decimal number : ");
    float decimal = sc2.nextFloat();
    System.out.println(decimal);
    
    Scanner bool = new Scanner(System.in);
    System.out.print("Enter true or false : ");
    boolean condition = bool.nextBoolean();
    System.out.println(condition);

    }
}