package Kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.northwind.business.abstracts.ProductService;
import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
import Kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import Kodlamaio.northwind.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(),"Data has been listed");
				
				
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Product has been added");
	}

}
