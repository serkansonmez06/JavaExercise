package Kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.northwind.entity.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {

	//Product and INteger indicates table and id number in database
	
	
	
}
