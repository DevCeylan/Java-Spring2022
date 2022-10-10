package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// contains only db access codes
		System.out.println("Added to database with JDBC");
	}
}

// what if there is a new option for DB process, like Hibernate ? 