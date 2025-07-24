package Collections;
import java.util.*;
class Employ{
	String names;
	Employ(String names){
		this.names=names;
	}
	public String toString() {
		return names;
	}
}
public class Setq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<Employ> h=new HashSet<>();
     h.add(new Employ("Teju"));
     h.add(new Employ("Keerthana"));
     h.add(new Employ("Swati"));
     Iterator<Employ> itr=h.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
	}

}