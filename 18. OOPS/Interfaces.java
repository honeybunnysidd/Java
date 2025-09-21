
public class Interfaces {

    public static void main(String args[]) {

        Bear b1 = new Bear();
        b1.eat();

    }
}

interface herbivore {

    void eat();
}

interface carnivore {

    void eat();
}

class Bear implements herbivore, carnivore {

    public void eat() {
        System.out.println("Eat Both");
    }
}
