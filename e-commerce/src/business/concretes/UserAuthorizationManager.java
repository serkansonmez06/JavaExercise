package business.concretes;

import business.abstracts.UserAuthorizationService;

public class UserAuthorizationManager implements UserAuthorizationService {

	@Override
	public boolean validation(String email) { // return true or false . 
		
		if(email!=null) { // must be email. email cant be null and returns true
			System.out.println("activate your email address: click ");
			return true;
		}
		
		return false;
	}

}
