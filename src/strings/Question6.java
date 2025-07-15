package strings;
//Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.

//You may assume that n is between 0 and the length of the string, inclusive.
public class Question6{
    public static String repeatLastN(String str, int n) {
        if (n < 0 || n > str.length()) {
            return "Invalid input";
        }

        String lastN = str.substring(str.length() - n); // last n characters
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }

        return result.toString();
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String str = reader.readLine();

        System.out.print("Enter an integer n (0 to " + str.length() + "): ");
        int n = Integer.parseInt(reader.readLine());

        String output = repeatLastN(str, n);
        System.out.println("Output: " + output);
    }
}
