public class Caseconverter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter one character");
            return;
        }

        char ch = args[0].charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        else if (Character.isLowerCase(ch))
            System.out.println(ch + "->" + Character.toUpperCase(ch));
    }
}
