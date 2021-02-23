package com.fullstackdemo.rest.webservices.restfulwebservices.helloworld;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



//controller


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

	//GET
	//URI - /hellopworld
	//method - "Hello World"
	
	
	
	@GetMapping(path="/Admin")
	public String helloWorld() {
		return "Serkan Sonmez";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return  new HelloWorldBean ("Object message from eclips");
	}
	
	//hello-world/path-variable/serkan
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
//		throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format("Hello World, %s",name)) ;
	}
	
	
}
