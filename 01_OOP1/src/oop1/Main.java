package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("xxx Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImgUrl("bilmemne1.jpg");

		Product product2 = new Product();
		product2.setName("yyy Kahve Makinesi");
		product2.setUnitPrice(8500);
		product2.setDiscount(7);
		product2.setUnitInStock(13);
		product2.setImgUrl("bilmemne2.jpg");
		
		Product product3 = new Product();
		product3.setName("zzz Kahve Makinesi");
		product3.setUnitPrice(5500);
		product3.setDiscount(7);
		product3.setUnitInStock(2);
		product3.setImgUrl("bilmemne3.jpg");
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		// Inheritance Example:
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05432100000");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Mehmet");
		individualCustomer.setLastName("Ceylan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setPhone("05432100000");
		corporateCustomer.setCustomerNumber("12345");
		corporateCustomer.setCompanyName("xxx Company");
		corporateCustomer.setTaxNumber("1123");
		
		/*
		 * value type vs reference type in practice
		 * Different classes that are inherited from the same class can be used together
		 * IF they use the ancestor class as a reference.
		 */
		
		Customer[] customers = {individualCustomer,corporateCustomer}; // valid.
		// since both ..Customer types are inherited from "Customer", we can store them both
		// in a single array which is using the ancestor class as a value type (reference to others) .
	}

}
