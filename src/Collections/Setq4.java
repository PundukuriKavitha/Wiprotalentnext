package Collections;
import java.util.*;
class CountryN{
	TreeSet<String> H1;
	public CountryN(){
		H1=new TreeSet<>();
	}
	public TreeSet<String> saveCountryNames(String CountryName){
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		if(H1.contains(CountryName)) {
			return CountryName;
		}
		return null;
	}
}
public class Setq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CountryN cc=new CountryN();
    cc.saveCountryNames("India");
    cc.saveCountryNames("America");
    cc.saveCountryNames("Japan");
    System.out.println("Countries in TreeSet "+cc.H1);
     System.out.println("Searching Japan : "+cc.getCountry("Japan"));
     System.out.println("Searching France : "+cc.getCountry("France"));
     
	}

}