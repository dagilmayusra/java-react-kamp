package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

	Product getByProductName(String productName);
	
	Product getByProductNameAndCategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategoryId(String productName, int categoryId);

	List<Product> getByCategoryIdIn(List<Integer> categories);
	//select * from products where category_id in(1,2,3,4)
	
	List<Product> getByProductNameContains(String productName); //arama yapıyor
	
	List<Product> getByProductNameStartsWith(String productName); //bu isimle başlayanları getırecektır
	
	@Query("From Product where productName=:productName and categoryId=:categoryId")  //product burada entity, iki nokta veya soru işareti paremetre oldugunu ifade eder
	List<Product> getByNameAndCategory(String productName, int categoryId);
	//select*from where product_name=bisey and categoryId=bisey
}
