package Collections;
import java.util.*;
import java.util.Map.Entry;
class Countries{
	HashMap<String,String> M1=new HashMap<>();
	public HashMap<String,String> saveCountryCaptial(String CountryName,String capital){
		M1.put(CountryName,capital);
		return M1;
	}
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	public String getCountry(String capitalName) {
		for(Map.Entry<String,String> entry:M1.entrySet()) {
			if(entry.getValue().equals(capitalName)) {
				return entry.getKey();
			}
		}
		return null;
	}
	public HashMap<String,String> reversedMap(){
		HashMap<String,String> M2=new HashMap<>();
		for(Map.Entry<String, String> entry:M1.entrySet()) {
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}
	public ArrayList<String> getAllCountries(){
		return new ArrayList<>(M1.keySet());
	}
}
public class Mapq1 {

	public static void main(String[] args) {
	Countries Cc=new Countries();
	Cc.saveCountryCaptial("India","NewDelhi");
	Cc.saveCountryCaptial("Japan", "Tokyo");
	System.out.println("Capital of India : "+Cc.getCapital("India"));
	System.out.println("Country of Tokyo : "+Cc.getCountry("Tokyo"));
	HashMap<String,String> rev=Cc.reversedMap();
	System.out.println("Reverse : "+rev);
	ArrayList<String> Countries=Cc.getAllCountries();
	System.out.println(Countries);
	}
}