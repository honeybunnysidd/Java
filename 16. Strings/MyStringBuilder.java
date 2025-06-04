public class MyStringBuilder{
    public static void main(String args[]){

        //Creating String Builder
        StringBuilder sb = new StringBuilder("Hello");

        //Print original String Builder
        System.out.println("Original String Builder : " + sb);
        System.out.println("Length: " + sb.length());

        // Append Something
        sb.append("! Your Welcome");
        System.out.println("StringBuilder: " + sb);

        //Convert Letter to Uppercase
        String str = "hello i am sidd";
        System.out.println(upCase(str));
    }

    //Convert Letter to Uppercase
    public static String upCase(String str){
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();   // StringBuilder to String conversion (Work only Object)
    }

}