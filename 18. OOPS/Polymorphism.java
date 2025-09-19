
public class Polymorphism {

    public static void main(String args[]) {

        // Method Overloading
        System.out.println("Method OverLoading----------");

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 9));
        System.out.println(calc.sum(5.5f, 9.4f));
        System.out.println(calc.sum(5, 9, 5));

        // Method Overriding
        System.out.println("Method Overriding----------");

        Dog doggy = new Dog();

        doggy.eat();

    }
}

// Method Overloading
class Calculator {

    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    float sum(float a, float b) {
        return (a + b);
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding
class Animal {

    void eat() {
        System.out.println("Eat Something");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Eat Biscuits");
    }
}
