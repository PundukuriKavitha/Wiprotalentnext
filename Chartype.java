public class Chartype {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter one character");
            return;
        }

        char ch = args[0].charAt(0);

        if (Character.isLetter(ch))
            System.out.println("Alphabet");
        else if (Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
