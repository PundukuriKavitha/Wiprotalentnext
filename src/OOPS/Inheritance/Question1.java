package OOPS.Inheritance;
public class Question1 {
    public static void main(String[] args) {
        // Parent class object
        Animal a = new Animal();
        a.eat();
        a.sleep();

        System.out.println();

        // Child class object
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
