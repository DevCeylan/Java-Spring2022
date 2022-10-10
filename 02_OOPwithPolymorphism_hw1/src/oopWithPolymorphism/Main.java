package oopWithPolymorphism;

import oopWithPolymorphism.business.CustomerManager;
import oopWithPolymorphism.business.MilitaryCreditManager;
import oopWithPolymorphism.business.TeacherCreditManager;
import oopWithPolymorphism.entities.Company;
import oopWithPolymorphism.entities.Customer;
import oopWithPolymorphism.entities.Person;

public class Main {

	public static void main(String[] args) {

		Person person = new Person();
		person.setId(41);
		person.setName("Mehmet Ceylan");
		person.setNationalIdentity("1111");
		
		Company company = new Company();
		company.setId(0);
		company.setName("ACME");
		company.setTaxNumber("8132134");
		
		CustomerManager customerManager =  new CustomerManager(person, new TeacherCreditManager()); // instance creation (goes into heap)
		customerManager.save();
		customerManager.giveCredit();
		CustomerManager customerManager2 =  new CustomerManager(company, new MilitaryCreditManager()); // instance creation (goes into heap)
		customerManager2.save();
		customerManager2.giveCredit();
		
	}

}

class CreditManager {

	public void Calculate() {
		System.out.println("Calculated.");
	}

	public void Save() {
		System.out.println("Saved.");
	}

}

