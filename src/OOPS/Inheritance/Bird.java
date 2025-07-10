package OOPS.Inheritance;
public class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird is eating seeds");
    }

    @Override
    void sleep() {
        System.out.println("Bird sleeps in its nest");
    }

    void fly() {
        System.out.println("Bird is flying");
    }
}
