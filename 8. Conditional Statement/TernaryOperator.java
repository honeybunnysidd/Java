public class TernaryOperator{
    public static void main(String args[]){

// Ternary operator --------------------------------
    // variable = condition ? statement1(true) : statement2(False);

    //Example
    int number = 27;
    String type = number % 2==0? "even" : "odd";
    System.out.println(number + " is " + type);

    //Example
    int marks = 32;
    String result = marks>=33? "Pass" : "Fail";
    System.out.println(result);


    }
}