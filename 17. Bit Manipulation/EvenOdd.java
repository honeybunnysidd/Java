public class EvenOdd{
    public static void main(String args[]){

        checkOddEven(3);
        checkOddEven(9);
        checkOddEven(42);

    }

    //Check if a number is odd or even
    public static void checkOddEven(int number){

        int bitMask = 1;

        if((number & bitMask) == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }

}