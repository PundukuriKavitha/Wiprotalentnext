package strings;
public class Question5{
    public static String mergeAlternately(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = 0, lenA = a.length(), lenB = b.length();
        int minLen = Math.min(lenA, lenB);

        // Combine characters from both strings alternately
        for (; i < minLen; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        // Append remaining characters from the longer string
        if (i < lenA) result.append(a.substring(i));
        if (i < lenB) result.append(b.substring(i));

        return result.toString();
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));

        System.out.print("Enter first string (a): ");
        String a = reader.readLine();

        System.out.print("Enter second string (b): ");
        String b = reader.readLine();

        String merged = mergeAlternately(a, b);
        System.out.println("Merged String: " + merged);
    }
}
