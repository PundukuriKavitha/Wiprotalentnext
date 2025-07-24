package Collections;
import java.util.*;
class Employe{
	int id;
	String name;
	double Salary;
	Employe(int id,String name,double Salary){
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	public String toString() {
		return "Emp id: "+id+" name: "+name+" Salary: "+Salary;
	}
}
public class Listq5 {
	public static void main(String[] args) {
	Vector<Employe> vec=new Vector<>();
	vec.add(new Employe(101,"tej",100000));
	vec.add(new Employe(102,"Keerthana",20000));
	vec.add(new Employe(103,"swati", 30000));
	System.out.println("===Using Iterator==");
	Iterator<Employe> itr=vec.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("===USing Enumeration");
	Enumeration<Employe> ee=vec.elements();
	while(ee.hasMoreElements()) {
		System.out.println(ee.nextElement());
	}
  }
}