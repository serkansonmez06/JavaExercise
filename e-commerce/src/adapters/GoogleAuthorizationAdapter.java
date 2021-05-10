package adapters;

import business.abstracts.UserAuthorizationService;
import entities.concretes.User;
import google.GoogleAuthorizationService;
import google.GoogleUser;

public class GoogleAuthorizationAdapter implements UserAuthorizationService { //implements business interface

	@Override
	public boolean validation(String email) {
		if(email!=null) { //check if user in google database
			GoogleAuthorizationService googleAuthorizationService = new GoogleAuthorizationService();
			googleAuthorizationService.Authorization();
			
		}
		return false;
	}
	
	private String password;
	private int id;
	
	public GoogleAuthorizationAdapter(String password, int id) {
		super();
		this.password = password;
		this.id = id;
	}
	
	
	
//	public User mappingUser() {
//		
//		User user = new User(); // instantiated 
//		GoogleUser googleUser =new GoogleUser(); //instantiated
//		
//		user.setId(id); 
//		user.setFirstName(googleUser.getFirstName());
//		user.setLastName(googleUser.getLastName());
//		user.setEmail(googleUser.getEmail());
//		user.setPassword(password);
//		
//		
//		return user;
//		
//	}
	

}
