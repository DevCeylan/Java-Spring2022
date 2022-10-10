package oopWithPolymorphism.business;

import oopWithPolymorphism.entities.Customer;

public class CustomerManager {
	private Customer customer;
	private CreditManager creditManager;
	/**
	 * @param customer
	 */
	public CustomerManager(Customer customer, CreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}
	public void save() {
		System.out.println("Save Customer: " + customer.getName());
	}
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Credit added.");
		
	}
}
