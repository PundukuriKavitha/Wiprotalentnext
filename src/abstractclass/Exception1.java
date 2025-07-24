package abstractclass;
import java.util.*;
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    try {
    	System.out.println("Enter no.of elements");
    	int n=Integer.parseInt(sc.nextLine());
    	int[] arr=new int[n];
    	System.out.println("Enter the elements in the array");
    	for(int i=0;i<n;i++) {
    		arr[i]=Integer.parseInt(sc.nextLine());
    	}
    	System.out.println("Enter the no to access");
    	int s=Integer.parseInt(sc.nextLine());
    	System.out.println("The array element at index"+s+"="+arr[s]);
    }catch(ArrayIndexOutOfBoundsException e) {
    	e.toString();
    }
    catch(NumberFormatException e) {
    	e.toString();
    }
     
	}

}