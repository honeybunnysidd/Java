import java.util.Scanner;

public class Strings{

    //print all letters
    public static void printletters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String args[]){

        // Strings are IMMUTABLE-------------

        // Input | Output --------------------------------
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        System.out.println("Welcome " + name);

        //Length of a String
        System.out.println("Length of your name : " + name.length());

        //charAt(index)
        System.out.println("Char at 0 : "+  name.charAt(0));
        System.out.println("Char at last : "+  name.charAt(name.length()-1));

        //print all letters
        printletters(name);


    }
}