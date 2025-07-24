package Collections;
import java.util.*;
public class Setq3 {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<>();
		tree.add("Rose");
		tree.add("Lotus");
		tree.add("Marigold");
		tree.add("Tulip");
		tree.add("Jasmine");
		System.out.println(tree);
		System.out.println("Reversed Elements");
		NavigableSet<String> nav=tree.descendingSet();
		System.out.println(nav);
		System.out.println("Iterator Elements");
		Iterator<String> itr=tree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		String check="Lotus";
		if(tree.contains(check)) {
			System.out.println("Flower contains in the set : "+check);
		}else {
			System.out.println("Not found");
		}
	}

}