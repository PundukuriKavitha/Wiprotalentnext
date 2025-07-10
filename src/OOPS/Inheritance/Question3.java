package OOPS.Inheritance;
public class Question3 {

    // Overloaded method for int
    public static int power(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Overloaded method for double
    public static double power(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Testing int power
        int intResult = power(3, 4);  // 3^4 = 81
        System.out.println("3 to the power 4 (int): " + intResult);

        // Testing double power
        double doubleResult = power(2.5, 3);  // 2.5^3 = 15.625
        System.out.println("2.5 to the power 3 (double): " + doubleResult);
    }
}
