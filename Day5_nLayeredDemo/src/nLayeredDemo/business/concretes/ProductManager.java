package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	//i� yapan s�n�f
	
	//dependenc
	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService= loggerService;
	}

	@Override
	public void add(Product product) {
		//i� kodlar� yaz�l�r
		if(product.getCategoryId()==1) {
			System.out.println("bu kategor�de urun kabul ed�lm�yor");
			return;
		}
	
		this.productDao.add(product);
		this.loggerService.logToSystem("urun eklendi" + product.getName());
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

	
}
