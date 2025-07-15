//Write a java program that accepts a string and returns a new string without the first and last character of the input string.

package strings;
public class Question10{
    public static String removeFirstAndLast(String str) {
        if (str.length() <= 2) {
            return ""; // Or return "Invalid input" for clarity
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String input = reader.readLine();

        String result = removeFirstAndLast(input);
        System.out.println("Result: " + result);
    }
}
