package Collections;
import java.util.*;
import java.util.stream.*;
class Employeeee{
	int empNo;
	String name;
	int age;
	String location;
	Employeeee(int empNo,String name,int age,String location){
		this.empNo=empNo;
		this.name=name;
		this.age=age;
		this.location=location;
	}
	public String toString() {
		return empNo+" "+name+" "+age+" "+location;
	}
}
public class Streamq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Employeeee> li=new ArrayList<>();
     li.add(new Employeeee(1,"Teju",20,"Pune"));
     li.add(new Employeeee(2,"jyosh",21,"Chennai"));
     li.add(new Employeeee(3,"vaish",22,"Nangala"));
     li.add(new Employeeee(4,"keerthana",23,"Pune"));
     li.add(new Employeeee(5,"mokshi",24,"Kadapa"));
     List<Employeeee> l2=li.stream()
    		 .filter(s->s.location.contains("Pune")).
    		 collect(Collectors.toList());
     for(Employeeee em:l2) {
    	 System.out.println(em);
     }
     
	}

}