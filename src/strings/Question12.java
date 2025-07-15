//Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
package strings;
public class Question12 {
    public static String removeXAtEnds(String str) {
        int len = str.length();

        if (len == 0) return "";

        if (len == 1 && str.equals("x")) {
            return ""; // only one 'x'
        }

        if (str.startsWith("x")) {
            str = str.substring(1); // remove first char
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1); // remove last char
        }

        return str;
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String input = reader.readLine();

        String result = removeXAtEnds(input);
        System.out.println("Output: " + result);
    }
}

