package abstractclass;
import java.util.*;
class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		// TODO Auto-generated constructor stub
		System.out.println("User Outside India Cannot be register");
	}
	InvalidCountryException(String msg){
		super(msg);
	}
}
public class Exception4 {
	void register(String name,String country) throws Exception{
		if(!country.equalsIgnoreCase("India")) {
			throw new InvalidCountryException();
		}
		System.out.println("User registered successfully");
	}
  	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		Exception4 n=new Exception4() ;
  		Scanner sc=new Scanner(System.in);
  		String name=sc.nextLine();
  		String country=sc.nextLine();
  		try {
  		n.register(name, country);
  		}
  		catch(Exception e) {
  			e.getMessage();
  		}
	}

}