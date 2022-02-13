package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController		
@RequestMapping("/api/products")		
public class ProductsController {

    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/getall")	
    public DataResult<List<Product>> getAll(){
        return productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return productService.add(product);
    }
    
    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName){
    	 
    	return this.productService.getByProductName(productName);
    }
	
    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName, @RequestParam int categoryId){
    	return this.productService.getByProductNameAndCategoryId(productName, categoryId);
    }
    
    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
    	return this.productService.getByProductNameContains(productName);
    }
    
    @GetMapping("/getAllByPage")
    DataResult<List<Product>> getAll(int pageNo, int pageSize){
    	return this.productService.getAll(pageNo, pageSize);
    }
    
    @GetMapping("getAllDesc")
    public DataResult<List<Product>> getAllSorted(){
    	return this.productService.getAllSorted(); 
    }
} 
