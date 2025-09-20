
public class Abstraction {

    public static void main(String args[]) {

        // Creating object
        Horse h = new Horse();
        h.eat();
        h.walk();

        //Creating one more object
        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
    }
}

//Abstract class
abstract class Animal {

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void walk() {
        System.out.println("Horse walks on 4 legs");

    }

}

class Chicken extends Animal {

    void walk() {
        System.out.println("Chicken walks on 2 legs");

    }
}
