
import adapters.GoogleAuthorizationAdapter;
import business.abstracts.UserService;
import business.concretes.UserAuthorizationManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		
		
		user1.setFirstName("Serkan");
		user1.setLastName("Sonmez");
		user1.setPassword("82910d");
		user1.setEmail("serkan@gmail.com");
		
		User user2 = new User();
	    
	    user2.setFirstName("S");
		user2.setLastName("Sonmez");
		user2.setPassword("0d");
		user2.setEmail("serkangmail.com");

	    UserService userManager = new UserManager(new UserAuthorizationManager(),new HibernateUserDao());
	    
	     
	    System.out.println("=========================================");
	    
	    
	    userManager.login("serkan@gmail.com", "82jj910d");
	    userManager.delete(user2);
	    userManager.update(user2);
	    userManager.register(user2);
	    
	    
	    UserService userManager1 = new UserManager(new UserAuthorizationManager(),new HibernateUserDao());
	    
	   
	    
	    System.out.println("=========================================");
	    
	    
	    GoogleAuthorizationAdapter googleAuthorizationAdapter=new GoogleAuthorizationAdapter("37373", 1);
	    
		googleAuthorizationAdapter.validation("srknsnmz@gmail.com");
		
		
		UserService userManager3=new UserManager(googleAuthorizationAdapter,new HibernateUserDao()); 
		userManager3.delete(user2);
		
	  
	    
	   
	    
	 

	   
	    
	

	}

}
