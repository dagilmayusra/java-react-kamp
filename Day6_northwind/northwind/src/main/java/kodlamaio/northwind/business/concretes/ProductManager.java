package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service 		//bu classın servıce gorevı gorecegını soyler
public class ProductManager implements ProductService{

	//productDao ve injextion
	private ProductDao productDao;
	
	@Autowired		//productdaonun instance olabilecek bir tane sınıfı turetıp onu verır
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
