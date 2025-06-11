public class Assignment{
    public static void main(String args[]){

        swap(10,42);

        System.out.println(addInteger(10));

        upperToLower();
        
    }
    //Question 2:  Swapp of two numbers without using third variable(XOR)
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    //Question 3 : Add 1 to an integer using Bit Manipulation
    public static int addInteger(int n){
        return -(~n);
    }

    //Question 4 : Convert uppercase characters to lowercase using bits
    public static void upperToLower(){
        for(char ch = 'A'; ch<= 'Z'; ch++){
            System.out.print((char) (ch | ' '));
        }
    }

}