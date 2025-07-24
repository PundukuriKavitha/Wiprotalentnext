package Wrapper;
import java.util.*;
class Employee implements Cloneable{
	String name;
	long salary;
	Employee cloneTest() {
		try {
			return (Employee) super.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Invaild details");
			return null;
		}
	}
}
public class Wrapperq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Employee e2;
		e.name="Teju";
		e.salary=100000;
		e2=e.cloneTest();
		System.out.println(e.name+" "+e.salary);
		e2.name="venkat";
		e2.salary=2000000;
		System.out.println(e2.name+" "+e2.salary);
	}

}