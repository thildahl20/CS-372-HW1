
public class EmployeeTest {

	public static void main(String[] args) {
		//My test program with 2 employees
		//Set the employees
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.setEmployeeName("John", "Smith");
		employee2.setEmployeeName("Jane", "Doe");
		employee1.setEmployeeSalary(1500);
		employee2.setEmployeeSalary(1300);
		//Output their info
		System.out.printf("%s %s has a yearly salary of $%f\n", employee1.FirstName, employee1.LastName, 12*employee1.MonthlySalary);
		System.out.printf("%s %s has a yearly salary of $%f\n", employee2.FirstName, employee2.LastName, 12*employee2.MonthlySalary);
		//Increase their salaries by 10%, and re-output
		employee1.setEmployeeSalary(1.1*1500);
		employee2.setEmployeeSalary(1.1*1300);
		System.out.printf("After a 10%% raise, %s %s has a yearly salary of $%f\n", employee1.FirstName, employee1.LastName, 12*employee1.MonthlySalary);
		System.out.printf("After a 10%% raise, %s %s has a yearly salary of $%f\n", employee2.FirstName, employee2.LastName, 12*employee2.MonthlySalary);

	}

}


