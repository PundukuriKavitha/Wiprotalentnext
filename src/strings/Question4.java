package strings;
public class 	Question4 {
    public static String removeStars(String str) {
        boolean[] remove = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                remove[i] = true;
                if (i > 0) remove[i - 1] = true;
                if (i < str.length() - 1) remove[i + 1] = true;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!remove[i]) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(
            new java.io.InputStreamReader(System.in));
        
        System.out.print("Enter a string: ");
        String input = reader.readLine();

        String output = removeStars(input);
        System.out.println("Result: " + output);
    }
}
