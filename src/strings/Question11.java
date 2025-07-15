package strings;
//Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

//The strings will not be the same length, but they may be empty (length 0).

//If input is "hi" and "hello", then output will be "hihellohi".
public class Question11{
    public static String combineShortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        System.out.print("Enter first string (a): ");
        String a = reader.readLine();

        System.out.print("Enter second string (b): ");
        String b = reader.readLine();

        String result = combineShortLongShort(a, b);
        System.out.println("Result: " + result);
    }
}


