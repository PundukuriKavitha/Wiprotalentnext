package Collections;
import java.util.*;

public class Lambdaq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			list.add(i + 1);
		}
		list.forEach(n -> {
			if (isPrime(n))
				System.out.println(n + " ");
		});
	}

	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}

		return true;

	}
}