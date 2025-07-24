package Collections;

import java.util.*;

class Countriesss{
	Hashtable<String,String> ht=new Hashtable<>();
	public Hashtable<String,String> saveCountryCapital(String CountryName,String capital){
		ht.put(CountryName, capital);
		return ht;
	}
	public String getCapital(String CountryName) {
		return ht.get(CountryName);
	}
	public String getCountry(String capitalName) {
		for(Map.Entry<String,String> me:ht.entrySet()) {
			if(me.getValue().contains(capitalName)) {
				return me.getKey();
			}
		}
		return null;
	}
	public Hashtable<String,String> reversed(){
		Hashtable<String,String> h2=new Hashtable<>();
		for(Map.Entry<String,String> me:ht.entrySet()) {
			h2.put(me.getValue(), me.getKey());
		}
		return h2;
	}
	public ArrayList<String> getAllCountries(){
		return new ArrayList(ht.keySet());
	}
}
public class Mapq6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countriesss cc=new Countriesss();
		cc.saveCountryCapital("India", "Delhi");
		cc.saveCountryCapital("Japan", "Tokyo");
        System.out.println("Capital of india: "+cc.getCapital("India"));
        System.out.println("Country of Tokyo: "+cc.getCountry("Tokyo"));
        Hashtable<String,String> rev=cc.reversed();
        System.out.println(rev);
        ArrayList<String> allCountry=cc.getAllCountries();
        System.out.println(allCountry);
	}

}