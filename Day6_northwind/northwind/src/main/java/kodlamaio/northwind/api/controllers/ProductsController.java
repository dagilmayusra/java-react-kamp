package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController		//controller oldugunu soyluyor
@RequestMapping("/api/products")		//adres uzerinden ıstek gelırse bu karsılar
public class ProductsController {
	
	//birden fazla service kullanıldıgı zamn autowired kullanılması gerek
	private ProductService productService;
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")	//istekte bulunduğu yeri çalıştırır
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
