package nLayeredDemo;



import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdaptor());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
 
	}

}
