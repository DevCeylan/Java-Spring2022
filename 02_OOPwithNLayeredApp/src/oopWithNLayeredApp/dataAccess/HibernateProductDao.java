package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// contains only db access codes
		System.out.println("Added to database with Hibernate");
	}
}
