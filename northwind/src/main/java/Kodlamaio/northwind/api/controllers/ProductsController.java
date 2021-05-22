package Kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.northwind.business.abstracts.ProductService;
import Kodlamaio.northwind.entity.concretes.Product;

@RestController
@RequestMapping("/api/products")           
public class ProductsController {
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	private ProductService productService;
	
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}

}
