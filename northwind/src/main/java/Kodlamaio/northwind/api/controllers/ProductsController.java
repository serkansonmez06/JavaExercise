package Kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.northwind.business.abstracts.ProductService;
import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;
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
	public DataResult <List<Product>> getAll(){
		return  this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
//	@PostMapping
//	public Result add(Product product) {
//		return new Result(true, "Product added")
//	}

}
