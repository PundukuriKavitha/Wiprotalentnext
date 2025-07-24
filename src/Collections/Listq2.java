package Collections;
import java.util.*;
class Employee{
	int empId;
	String empName;
	String gender;
	float salary;
	public Employee(int empId,String empName,String gender,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.gender=gender;
		this.salary=salary;
	}
	public void getEmployeeAll() {
		System.out.print(empId+" ");
		System.out.print(empName+" ");
		System.out.print(gender+" ");
		System.out.println(salary);
	}
}
class EmployeeDB{
	List<Employee> list=new ArrayList<>();
	public boolean addEmployee(Employee e) {
		return list.add(e);
	}
	public boolean deleteEmployee(int empId) {
		Iterator<Employee> itr=list.iterator();
		
		while(itr.hasNext()) {
			Employee e=itr.next();
			if(e.empId==empId) {
				itr.remove();
				return true;
			}
		}
		return false;
	}
	public String showPaySlip(int empId) {
		for(Employee e:list) {
			if(e.empId==empId) {
				return "PaySlip "+e.empId+": "+e.salary;
			}
		}
		return "Not found";
	}
	public void printAll() {
		for(Employee emp:list) {
			emp.getEmployeeAll();
		}
	}
}
public class Listq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EmployeeDB emp=new EmployeeDB();
     emp.addEmployee(new Employee(101,"teju","female", 100.0f));
     emp.addEmployee(new Employee(102, "keerthana", "keerthana@gmail.com", 200.0f));
     emp.addEmployee(new Employee(103, "swati", "swati@gmail.com", 300.0f));
     emp.printAll();
     System.out.println(emp.showPaySlip(101));
     System.out.println("Deleted"+emp.deleteEmployee(102));
     
     emp.printAll();
	}

}