package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.*;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service 		//bu classın servıce gorevı gorecegını soyler
public class ProductManager implements ProductService{

	//productDao ve injextion
	private ProductDao productDao;
	
	@Autowired		//productdaonun instance olabilecek bir tane sınıfı turetıp onu verır
	public ProductManager(ProductDao productDao){
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll(){
        return new SuccessDataResult<List<Product>>(
                this.productDao.findAll(),
                "Data listelendi"
        );
    }

    @Override
    public Result add(Product product) {
        try{
            productDao.save(product);
            return new SuccessResult("Ürün eklendi");
        } catch (Exception e){
            return new ErrorResult("Ürün eklenemedi");
        }
    }

	@Override
	public DataResult<Product> getByProductName(String productName) {
		 return new SuccessDataResult<Product>(
	                this.productDao.getByProductName(productName),
	                "Data listelendi"
	                //successdataresult dondur, product turu için
	                //dondureceği şey dao dan getByProductName den productName çağırma ve mesaj dondurme
	     );
	}

	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		//business codes
		
		return new SuccessDataResult<Product>(
                this.productDao.getByProductNameAndCategoryId(productName,categoryId),
                "Data listelendi"
		);
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		 return new SuccessDataResult<List<Product>>(
	                this.productDao.getByProductNameOrCategoryId(productName,categoryId),
	                "Data listelendi"
	        );
	}

	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(
                this.productDao.getByCategoryIdIn(categories),
                "Data listelendi"
        );
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(
                this.productDao.getByProductNameContains(productName),
                "Data listelendi"
        );
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(
                this.productDao.getByProductNameStartsWith(productName),
                "Data listelendi"
        );
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(
                this.productDao.getByNameAndCategory(productName, categoryId),
                "Data listelendi"
        );
	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>(
				this.productDao.findAll(pageable).getContent()	
		);
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "productName"); //asc artan, a dan z ye.. desc tam tersi
		
		return new SuccessDataResult<List<Product>>(
				this.productDao.findAll(sort), "Başarılı"
		);
	}

	
}