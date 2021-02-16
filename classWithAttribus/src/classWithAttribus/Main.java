package classWithAttribus;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name="Laptop";
		System.out.println(product.name);
		product.setId(1);
		product.description="macPro";
		
		product.price=50.000;
		product.stockAmount=3;
		
		System.out.println(product.getKod());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
	}

}
