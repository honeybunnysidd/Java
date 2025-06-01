public class SubString{

    // public static String subString(String str, int si, int ei){
    //     String subPart = "";
    //     for(int i=si; i<ei; i++){
    //         subPart += str.charAt(i);
    //     }
    //    return subPart;
    // }

    public static void main(String args[]){
        //Substring
        String str = "HelloWorld";
        // System.out.println(subString(str, 3, 5));
        System.out.println(str.substring(3, 5));
    }
}