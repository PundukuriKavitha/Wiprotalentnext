package Collections;
import java.util.*;
public class Mapq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties india=new Properties();
		india.setProperty("AndhraPradesh","Amaravthi");
		india.setProperty("Telangana", "Heyderabad");
		india.setProperty("Goa","panaji");
		india.setProperty("Karnataka", "Banglore");
		Set<Object> set=india.keySet();
		Iterator<Object> itr=set.iterator();
		while(itr.hasNext()) {
			String state=(String)itr.next();
			String capital=(String)india.getProperty(state);
			System.out.println("States : "+state+" Capital : "+capital);
		}
	}
}