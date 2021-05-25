package Kodlamaio.northwind.business.abstracts;

import java.util.List;

import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
import Kodlamaio.northwind.entity.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	Result add(Product product);

}
