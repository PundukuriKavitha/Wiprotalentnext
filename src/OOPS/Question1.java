// Base class
package OOPS;
class Fruit {
    String name;
    String taste;
    int size;

    // Constructor
    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to override
    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

// Subclass 1: Apple
class Apple extends Fruit {

    Apple(int size) {
        super("Apple", "Sweet", size);
    }

    @Override
    void eat() {
        System.out.println("Eating an " + name + ": It tastes " + taste + ".");
    }
}

// Subclass 2: Orange
class Orange extends Fruit {

    Orange(int size) {
        super("Orange", "Sour", size);
    }

    @Override
    void eat() {
        System.out.println("Eating an " + name + ": It tastes " + taste + ".");
    }
}

// Main class
public class Question1 {
    public static void main(String[] args) {
        Fruit apple = new Apple(5);
        Fruit orange = new Orange(4);

        apple.eat();
        orange.eat();
    }
}
