import java.util.Scanner;
public class Oddoreven{
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  integer");
		int n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}