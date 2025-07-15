package strings;
//Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
public class Question9 {
    public static String getFirstHalfIfEven(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String input = reader.readLine();

        String result = getFirstHalfIfEven(input);
        System.out.println("Output: " + result);
    }
}

