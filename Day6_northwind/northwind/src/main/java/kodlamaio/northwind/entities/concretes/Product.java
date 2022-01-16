package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data		//lombok butun get ve setlerı getırır
@Entity		//product bir entity oldugunu belırtır.bir anatasyon..veritabanı nesnesı oldugunu soylerız
@Table(name="products")    //veritabanında neye esıt oldugu verılır
public class Product {
	
	@Id					//sorgular bu ıd ye gore yapılır
	@GeneratedValue 	//id nin nasıl üretilecegini soyler
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	
}
