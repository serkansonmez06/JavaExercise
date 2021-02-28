package com.example.youtube.backend.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Product {
    private Integer id;
    private String name;
    private float price;
    private int phone;
   
  
   
 
    public Product() {
    }
 
    public Product(Integer id, String name, float price, int phone  ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.phone = phone;
       
        
        
        
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}



	

 
    
}
