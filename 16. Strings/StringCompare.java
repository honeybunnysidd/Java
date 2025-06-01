public class StringCompare{
    public static void main(String args[]){
        String s1 = "Siddhartha";
        String s2 = "Siddhartha";

        String s3 = new String("Siddhartha");

        //Compare s1 and s2
        if(s1==s2){
            System.out.println("s1 and s2 are equal");  //<--- both point at the same value
        }else{
            System.out.println("s1 and s2 are not equal");
        }

        //Compare s1 and s3
        if(s1==s3){
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("s1 and s3 are not equal"); //<--- due to new keyword
        }

        //Compare s1 and s3 with .equals()
       if(s1.equals(s3)) {    //.equals() always returns a boolean value
            System.out.println("s1 and s3 are equal");
       } else{
            System.out.println("s1 and s3 are not equal"); //<--- due to new keyword
       }

    }
}