package oop1.UnderstandingInheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customerManager.Add();
		employeeManager.Add();
		employeeManager.BestEmployee();

	}

}
