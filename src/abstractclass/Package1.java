package abstractclass;

class Box {
    private double height;
    private double width;
    private double depth;

    // Constructor to initialize the box
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolume() {
        return height * width * depth;
    }

    public void printDetails() {
        System.out.println("=== Box Details ===");
        System.out.println("Height  : " + getHeight());
        System.out.println("Width   : " + getWidth());
        System.out.println("Depth   : " + getDepth());
        System.out.println("Volume  : " + getVolume());
    }
}

public class Package1 {
    public static void main(String[] args) {
        Box myBox = new Box(10.0, 20.0, 30.0);
        myBox.printDetails();
    }
}
