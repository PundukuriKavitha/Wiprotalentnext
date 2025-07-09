public class LastDigitcheck {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter two numbers");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a % 10 == b % 10);
    }
}