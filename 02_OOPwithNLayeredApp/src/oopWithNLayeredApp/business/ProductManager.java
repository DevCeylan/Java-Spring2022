package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private List<Logger> loggers;
	
	/**
	 * @param productDao
	 */
	public ProductManager(ProductDao productDao, List<Logger> loggers) {
		super();
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception { 
		// request/response pattern
		// business rules
		if(product.getUnitPrice()<10) {
			throw new Exception("Price cannot be less than 10");
		}
		// if valid:
		productDao.add(product);
		
		for (Logger logger : loggers) { // db,mail,file
			logger.log(product.getName());
		}
	}
}

// Loosely Coupled Interface implementation between Layers
// If a layer uses the class of another layer; it should only provide access from the interface.
// in ProductManager, there are no constructor from any other layer.