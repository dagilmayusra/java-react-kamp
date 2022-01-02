package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	
//veri giriþi interface
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id); //bir tane id istiyoruz ve bunu Producttan alýyor
	List<Product> getAll();
	
}
