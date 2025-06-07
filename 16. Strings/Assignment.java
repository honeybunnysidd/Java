import java.util.*;

public class Assignment{
    public static void main(String args[]){

        //Question 1 
        //countVowels();     

        //Question 4:
        String str1 = "earth";
        String str2 = "heart";

        checkAnagram(str1, str2);

    }

    //Question 1: Count how many times lowercase vowels occurrred in a string enterd by the user.
    public static void countVowels(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your string : ");

        String str = scan.nextLine();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch== 'u'){
                count++;
            }

        }
        System.out.println("Total number of lowercase vowels is : " + count);
    }

    //Question 4: Determine if 2 Strings are anagrams of each other.

    public static void checkAnagram(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()!= str2.length()){
            System.out.println("The given Strings are not anagram becuase they have different length");
            return;
        }else{

            //Convert Strings into char Array
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            //Sort the char array
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result = Arrays.equals(str1Array, str2Array);

            if(result){
                System.out.println("The given Strings are anagram");
            }else{
                System.out.println("The given Strings are not anagram");
            }
        }
    }

}