package com.springboot.application.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springboot.application.model.*;
import com.springboot.application.service.UserService;



@RestController    
public class UserController   
{    
	@Autowired    
	private UserService userService;     

	@RequestMapping("/hy")    
	public List<UserRecord> getAllUser()  {    
		System.out.println(userService.getAllUsers());	//test
		return userService.getAllUsers();    
	} 

	@RequestMapping(value="/add-user", method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord)  
	{    
		userService.addUser(userRecord);    
	}       
}    