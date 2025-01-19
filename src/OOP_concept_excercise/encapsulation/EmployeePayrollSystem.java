package OOP_concept_excercise.encapsulation;

/*
*Exercise: Employee Payroll System
Requirements:
You are tasked with designing a Payroll System using encapsulation principles. 
The system should manage employees of different types (e.g., permanent and contract). 
Ensure proper use of abstraction, concrete classes, final classes, and private fields to enforce encapsulation.

Specifications:
1. Interface:
	Create an interface Payable with methods:
		- double calculateSalary()
		- String getEmployeeDetails()
2. Abstract Class:
	Design an abstract class Employee that implements the Payable interface.
		- Declare private fields: employeeId, name, and baseSalary.
		- Provide protected getter and setter methods for these fields.
		- Implement getEmployeeDetails() to return the employee's details (ID and name).
		- Leave calculateSalary() abstract for subclasses to implement.
3. Concrete Class:
	Create a class PermanentEmployee that extends Employee.
		- Add private fields like bonus and allowance.
		- Use getters and setters to encapsulate these fields.
		- Implement the calculateSalary() method to calculate salary as:
			baseSalary + bonus + allowance.
3. Final Class:
	Create a final class ContractEmployee that extends Employee.
		- Add a private field hourlyRate and provide getters and setters.
		- Implement the calculateSalary() method to calculate salary as:
			hourlyRate * hoursWorked.
		- Prevent further subclassing using the final keyword.
4. Main Class:
	- Create a list of employees (List<Employee>) containing instances of PermanentEmployee and ContractEmployee.
	- Use the interface methods (calculateSalary() and getEmployeeDetails()) to display the details and salary of each employee.
	
5. Bonus Requirements:
	- Add validation in setters (e.g., salary and bonus cannot be negative).
	- Demonstrate how encapsulation ensures that invalid or unauthorized changes to fields are prevented.
*/

interface Payable{
	double calculateSalary();
	String getEmployeeDetails();
}

abstract class Employee implements Payable {
	private int employeeID;
	private String name;
	private double baseSalary;
	
	protected void setEmployeeID (int employeeID) {
		this.employeeID = employeeID;
	}
	
	protected void setName (String name) {
		this.name=name;
	}
	
	protected void setBaseSalary (double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	protected int getEmployeeID() {
		return employeeID;
	}
	
	protected String getName() {
		return name;
	}
	
	protected double getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public String getEmployeeDetails() {
		return employeeID + name + baseSalary;
	}
	
	@Override
	public double calculateSalary() {
		return baseSalary;
	}
}

class PermanentEmployee extends Employee {
	private double bonus;
	private double allowance;
	
	void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	@Override
	public double calculateSalary() {
		return getBaseSalary() + bonus+ allowance;
		}
}

final class ContractEmployee extends Employee {
	private double hourlyRate;
	private double hoursWorked;
	
	void setHourlyRate(double hourlyRate) {
		this.hourlyRate=hourlyRate;
	}
	
	void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	double getHourlyRate() {
		return hourlyRate*hoursWorked;
	}
}

class EmployeePayrollSystem {
	
	public static void main (String[] args) {
		
		
	}
}