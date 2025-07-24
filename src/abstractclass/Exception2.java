package abstractclass;
import java.util.*;
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int sum=0;
     try {
     if(args.length!=5) {
    	 System.out.println("Please enter 5");
     }
     else {
    	 int[] arr=new int[5];
    	 for(int i=0;i<5;i++) {
    		 arr[i]=Integer.parseInt(args[i]);
    		 System.out.println(arr[i]+" ");
    		 sum+=arr[i];
    	 }
    	 System.out.println("Sum"+sum);
    	 int avg=sum/5;
    	 System.out.println("Average"+avg);
     }
     }
     catch(ArithmeticException e) {
    	 e.toString();
     }
     catch(NumberFormatException e) {
    	 e.toString();
     }
	}

}