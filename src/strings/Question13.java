//If the input is "xhix", then output is "Hi".

//If the input is "America", then the output is "America".
package strings;
public class Question13{
    public static String cleanString(String str) {
        int len = str.length();

        if (len == 0) return "";

        // Remove 'x' or 'X' at start
        if (str.length() > 0 && (str.charAt(0) == 'x' || str.charAt(0) == 'X')) {
            str = str.substring(1);
        }

        // Remove 'x' or 'X' at end
        if (str.length() > 0 && (str.charAt(str.length() - 1) == 'x' || str.charAt(str.length() - 1) == 'X')) {
            str = str.substring(0, str.length() - 1);
        }

        // Capitalize first character (if exists and is a letter)
        if (str.length() > 0) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }

        return str;
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String input = reader.readLine();

        String result = cleanString(input);
        System.out.println("Output: " + result);
    }
}
