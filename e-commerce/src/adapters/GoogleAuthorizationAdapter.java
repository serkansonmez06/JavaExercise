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
	
	
	

	

}
