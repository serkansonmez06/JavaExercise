package com.springboot.application.service;
import java.util.List;    
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;

import com.springboot.application.model.UserRecord;
import com.springboot.application.repository.UserRepository;



@Service    
public class UserService   
{    
	@Autowired    
	private UserRepository userRepository;   
	
	public List<UserRecord> getAllUsers()  
	{    
		List<UserRecord> userRecords = new ArrayList<>();    
		userRepository.findAll().forEach(userRecords::add);  
		System.out.println(userRecords);	//test
		return userRecords;    
	} 
	
	
	public void addUser(UserRecord userRecord)  
	{    
		userRepository.save(userRecord);    
	}    
}    
