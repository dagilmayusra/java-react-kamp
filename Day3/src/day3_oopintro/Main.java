package day3_oopintro;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram", 10);

        Product product2=new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setUnitPrice(1600);
        product2.setDetail("16 GB RAM");
        
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Ýçecek");
        
        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecek");
        
        System.out.println(category1.getName());
        System.out.println(category2.getName());
        
    }

}