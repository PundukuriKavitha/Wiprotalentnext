package Collections;
import java.util.*;
class Countriess{
	TreeMap<String,String> tm=new TreeMap<>();
	public TreeMap<String,String> saveCountryCapital(String CountryName,String capital){
		tm.put(CountryName, capital);
		return tm;
	}
    public String getCapital(String CountryName) {
    	return tm.get(CountryName);
    }
    public String getCountry(String capitalName) {
    	for(Map.Entry<String, String> me:tm.entrySet()) {
    		if(me.getValue().contains(capitalName)) {
    			return me.getKey();
    		}
    	}
    	return null;
    }
    public TreeMap<String,String> reversedMap(){
    	TreeMap<String,String> t2=new TreeMap<>();
    	for(Map.Entry<String, String> me:tm.entrySet()) {
    		t2.put(me.getValue(), me.getKey());
    	}
    	return t2;
    }
    public ArrayList<String> getAllCountries(){
    	return new ArrayList<>(tm.keySet());
    }
    
}
public class Mapq5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Countriess cn=new Countriess();
    cn.saveCountryCapital("India","Delhi");
    cn.saveCountryCapital("Japan","Tokyo");
    System.out.println("Capital of India "+cn.getCapital("India"));
    System.out.println("Country of Tokyo "+cn.getCountry("Tokyo"));
    TreeMap<String,String> rev=cn.reversedMap();
    System.out.println("Reverse"+rev);
    ArrayList<String> getAllco=cn.getAllCountries();
    System.out.println(getAllco);
    
	}

}