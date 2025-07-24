package Collections;
import java.util.*;
public class Mapq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Teju", 40176);
        hm.put("Keerthana", 40141);
        hm.put("swati", 40151);
        hm.put("a", 40189);
        String keyTocCheck="swati";
        if(hm.containsKey(keyTocCheck)) {
        	System.out.println("Key exists "+hm.get(keyTocCheck));
        }
        else {
        	System.out.println("Doesnot exist");
        }
        int valueToCheck=40176;
        if(hm.containsValue(valueToCheck)) {
        	System.out.println("Exist "+valueToCheck);
        }
        Set set=hm.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()) {
        	Map.Entry<String, Integer> me=(Map.Entry)itr.next();
        	System.out.println(me.getKey()+":"+me.getValue());
        }
	}

}