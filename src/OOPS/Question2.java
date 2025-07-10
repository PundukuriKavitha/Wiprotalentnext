// Base class
package OOPS;
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

// Subclass: Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

// Subclass: Triangle
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Subclass: Square
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

// Main class to test polymorphism
public class Question2 {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();   // Output: Drawing Circle
        c.erase();  // Output: Erasing Circle

        t.draw();   // Output: Drawing Triangle
        t.erase();  // Output: Erasing Triangle

        s.draw();   // Output: Drawing Square
        s.erase();  // Output: Erasing Square
    }
}
