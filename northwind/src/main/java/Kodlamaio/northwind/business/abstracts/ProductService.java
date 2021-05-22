package Kodlamaio.northwind.business.abstracts;

import java.util.List;

import Kodlamaio.northwind.entity.concretes.Product;

public interface ProductService {
	
	List<Product> getAll();

}
