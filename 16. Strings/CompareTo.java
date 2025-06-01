public class CompareTo{

    //CompareTo() -> compare 2 string lexicographically.
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};

        String largestLexico = fruits[0]; //let
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].compareTo(largestLexico)>0){
                largestLexico = fruits[i];
            }
        }
        System.out.println(largestLexico);
    }
}