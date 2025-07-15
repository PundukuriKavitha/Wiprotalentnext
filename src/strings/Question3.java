package strings;
import java.util.*;
//Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
public class Question3{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = repeatFirstTwo(input);
		System.out.println(output);
		
	}
	  public static String repeatFirstTwo(String str) {
	        int n = str.length();
	        String part = str.length() < 2 ? str : str.substring(0, 2);
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < n; i++) {
	            result.append(part);
	        }

	        return result.toString();
	    }
}