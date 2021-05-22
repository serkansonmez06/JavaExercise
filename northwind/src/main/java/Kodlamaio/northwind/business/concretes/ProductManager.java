package Kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.northwind.business.abstracts.ProductService;
import Kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import Kodlamaio.northwind.entity.concretes.Product;


@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao; //accessing data - dependency injection

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
