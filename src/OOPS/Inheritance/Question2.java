package OOPS.Inheritance;
public class Question2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Kavitha", 500000.0, 2022, "NI123456789");

        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Update details
        emp.setAnnualSalary(550000.0);
        emp.setName("Kavitha Pundukuri");

        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Updated Annual Salary: " + emp.getAnnualSalary());
    }
}
