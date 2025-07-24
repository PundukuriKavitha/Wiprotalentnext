package Wrapper;

public class Wrapperq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				if(args.length<=0) {
			 System.out.println("Please provide postive num");
			 return;
		}
		try {
			Integer i=Integer.parseInt(args[0]);
			System.out.println("Given Number:"+i);
			System.out.println("Binary equivalent:"+Integer.toBinaryString(i));
			System.out.println("Octal equivalent:"+Integer.toOctalString(i));
			System.out.println("Hexadecimal equivalent:"+Integer.toHexString(i));
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter valid");
		}
		}

}