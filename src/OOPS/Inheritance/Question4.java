package OOPS.Inheritance;
public class Question4{
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public Question4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double getVolume() {
        return width * height * depth;
    }

    // Main method to test the Box class
    public static void main(String[] args) {
        Question4 myBox = new Question4(4.5, 3.0, 2.0);
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}
