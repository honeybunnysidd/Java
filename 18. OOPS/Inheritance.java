
public class Inheritance {

    public static void main(String args[]) {

        Fish f1 = new Fish();
        f1.eat();
        f1.color = "blue";

        Dog d1 = new Dog();
        d1.breed = "Pomerian";
        d1.color = "White";
        d1.legs = 4;

        System.out.println(d1.breed);
        System.out.println(d1.color);
        System.out.println(d1.legs);

    }
}

//Parent Class or Base Class
class Animal {

    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}

//Single level Inheritance
//Child Class
class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swims in water");

    }

}

// Multi lever Inheritance
class Mammal extends Animal {

    int legs;

}

class Dog extends Mammal {

    String breed;
}
