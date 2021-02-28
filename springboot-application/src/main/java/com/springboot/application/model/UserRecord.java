package com.springboot.application.model;

import javax.persistence.*;

@Entity
public class UserRecord {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String email;
	
	public UserRecord() {
		super();
		this.name = "undefined";
		this.email = "undefined";
	}
	
	//Constructor
	public UserRecord(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	//Getters & Setters
	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	

}
