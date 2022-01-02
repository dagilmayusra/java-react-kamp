package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
//neyi service etmek istiyorsak onlarý yazýyourz.
	
	void add(Product product);
	List<Product> getAll();
}
