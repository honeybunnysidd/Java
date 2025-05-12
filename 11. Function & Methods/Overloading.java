public class Overloading {

    // Function Overloading
    // Multiple function with the same name but 'different parameters'. (no of parameter, data type of parameter)

    //Function Overloading using no of Parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Function Overloading using different Data type of parameters
    public static int product(int a, int b) {
        return a * b;
    }

    public static float product(float a, float b) {
        return a * b;
    }

    //Check if a number is Prime or not
    public static boolean checkPrime(int n){
       if (n <= 1) {
           // System.out.println(n + " is not a prime number. Please provide a number greater than 1.");
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    //System.out.println(n + " is not a prime number.");
                    return false;
                }
            }

       // System.out.println(n + " is a prime number.");
        return true;

        }
    }

    //Print all Primes in a range
    public static void printPrime(int n){
        for(int i=2; i<=n; i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Convert from Binary to Decimal
    public static void binaryToDecimal(int binary){
        int decimal = 0, copy = binary;
        for(int i=0; binary>0; i++){

            int rem = binary % 10;
            decimal += rem * (int) (Math.pow(2,i));
            binary /= 10;
        }
        System.out.println("Binary " + copy + " to Decimal = " + decimal);
    }

    //Convert from Decimal to Binary
    public static void decimalToBinary(int decimal){
        int binary = 0, copy = decimal;

        for(int i=1; decimal>0; i*=10){
            int rem = decimal % 2;
            binary += i*rem;
            decimal /= 2;
        }
        System.out.println("Decimal " + copy + " to Binary = " + binary);
    }


    
    public static void main(String args[]) {

    // Inbuilt v/s User Defined Methods --------------------------------
        /*
        1) User defined methods -> sum(), product(), factorial()
        2) Inbuilt methods -> sc.nextInt(), Math.sqrt(), Math.power(), Math.max() etc.
        */

        // Function Overloading using no of Parameters
        /*
        System.out.println(sum(10, 27));
        System.out.println(sum(10, 27, 42));
        */

        //Function Overloading using different Data type of parameters
        /*
        System.out.println(product(10, 27));
        System.out.println(product(10.10f, 27.27f));
        */

        //Check if a number is Prime or not
        //checkPrime(59);

        //Print all Primes in a range
        //printPrime(50);

        //Convert from Binary to Decimal
        //binaryToDecimal(111);

        //Convert from Decimal to Binary
        //decimalToBinary(7);



    }

}