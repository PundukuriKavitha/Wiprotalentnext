package Collections;
import java.util.*;
public class Lambdaq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list=new ArrayList<>();
     list.add("a");
     list.add("b");
     list.add("c");
     list.add("d");
     list.add("e");
     list.add("f");
     list.add("g");
     list.add("h");
     list.add("i");
     list.add("j");
     list.add("k");
     list.add("l");
     list.forEach(n->{
    	 System.out.print(n+" ");
     });
     System.out.println();
     
     Collections.reverse(list);
     System.out.println("Reverse");
     list.forEach(n->{
    	 System.out.print(n+" ");
     });
     
	}

}