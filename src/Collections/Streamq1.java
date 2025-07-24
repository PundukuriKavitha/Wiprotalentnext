package Collections;
import java.util.*;
import java.util.stream.*;
public class Streamq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> li=new ArrayList<>();
    li.add(1);
    li.add(-2);
    li.add(3);
    li.add(-1);
    li.add(-4);
    List<Integer> al=li.stream()
    		.filter(x->x<0).filter(x->x%2==0)
    		.collect(Collectors.toList());
    System.out.println(al);
	}

}