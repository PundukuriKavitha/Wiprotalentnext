package strings;
//Write a Program to check whether a given String is Palindrome or not.

public class Question1{
	public static void main(String[]args) {
		 String str = "mad";
		 StringBuilder  sb = new StringBuilder(str).reverse();
		 if(str.equals(sb.toString())) {
			 System.out.println("Palindrome");
		 }else {
			 System.out.println("not a palindrome");
		 }
       
		
	}
}