package Collections;
import java.util.*;
public class Mapq2 {

	public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<>();
	hm.put("Telangana", "hyderabad");
	hm.put("AndhraPradesh","Amaravati" );
	hm.put("Karnataka","Banglore");
	String keyToCheck="AndhraPradesh";
	if(hm.containsKey(keyToCheck)) {
		System.out.println("Key exists : "+hm.get(keyToCheck));
	}
	else {
		System.out.println("Does not exist key");
	}
	String valueToCheck="hyderabad";
	if(hm.containsValue(valueToCheck)) {
		System.out.println("Key exists : "+valueToCheck);
	}
	else {
		System.out.println("Does not exist key");
	}
	System.out.println("Iterating Values");
	Set<Map.Entry<String,String>> set=hm.entrySet();
	Iterator<Map.Entry<String, String>> itr=set.iterator();
	while(itr.hasNext()) {
		Map.Entry<String,String> me=(Map.Entry)itr.next();
		System.out.println(me.getKey()+":"+me.getValue());
	}
	}

}