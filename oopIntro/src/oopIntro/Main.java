package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product(1, "Lenovo V14", 1500, "16 Gb Ram",10);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenova V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(1600);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		System.out.println("----------------------");
		
		Category category1 =new Category();
		category1.setId(1);
		category1.setName("coke");
		
		System.out.println(category1.getName());
		
		Category category2 =new Category();
		category2.setId(2);
		category2.setName("food");
		
		
		System.out.println(category2.getName());
		
		
		

	}

}
