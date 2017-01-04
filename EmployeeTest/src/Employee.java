
public class Employee {
String FirstName;
String LastName;
double MonthlySalary;

Employee() {
	String FirstName = "John";
	String LastName = "Doe";
	double MonthlySalary = 0;
}

void setEmployeeName(String fname, String lname){ 
FirstName = fname;
LastName = lname;
}

void setEmployeeSalary(double salary){
if (salary > 0)
MonthlySalary = salary;
else MonthlySalary = 0;
	}
}
