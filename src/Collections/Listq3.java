package Collections;
import java.util.*;

public class Listq3 {
public static void printAll(ArrayList<String> s) {
	Iterator<String> itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> n=new ArrayList<>();
      n.add("teju");
      n.add("keerthana");
      n.add("swati");
      n.add("vaish");
      n.add("mokshi");
      printAll(n);
      
  	}
}