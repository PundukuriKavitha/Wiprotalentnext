package abstractclass;
import java.util.*;
class NegativeValueException extends Exception{
	NegativeValueException(String msg) {
		super(msg);
	}
}
	class OutOfRangeException extends Exception{
		OutOfRangeException(String msg){
			super(msg);
	}
}
public class Exception3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
    for(int i=1;i<=2;i++) {
    	System.out.println("Names"+i+":");
    	String names=sc.nextLine();
    	int tot=0;
    	boolean valid=true;
    	for(int j=1;j<=3;j++) {
    		System.out.println("Marks:"+j+":");
    		String in=sc.nextLine();
    		try {
    			int mark=Integer.parseInt(in);
    			if(mark<0) {
    				throw new NegativeValueException("Negative no not allowed");
    			}else if(mark>100) {
    				throw new OutOfRangeException("The marks must be 1 to 100");
    			}
    			tot+=mark;
    		}
    		catch(NumberFormatException e) {
    			valid=false;
    			break;
    		}
    		catch(NegativeValueException|OutOfRangeException e) {
    			System.out.println(e.getMessage());
    			valid=false;
    			break;
    		}
    	
    	}
    	if(valid) {
    		System.out.println("Avg marks"+(tot)/3.0);
    	}
    	else {
    		System.out.println("Skipping");
    	}
    	System.out.println("----------");
    }
  }
}
     

