package day3_oopintro;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double dicount;
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.unitPrice=unitPrice;
		this.dicount=discount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String Detail) {
		this.detail=detail;
	}
	
	public double getDicount() {
		return dicount;
	}
	public void setDicount(double dicount) {
		this.dicount=dicount;
	}
	
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.dicount / 100);
  	}
	
}
