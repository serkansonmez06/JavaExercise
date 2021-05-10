package business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserAuthorizationService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserAuthorizationService userAuthorizationService; // dependency injection
	private UserDao userDao; // dependency injection

	public UserManager( UserAuthorizationService userAuthorizationService,UserDao userDao) {
		super();
		this.userDao = userDao;
		this.userAuthorizationService = userAuthorizationService;
	}

	boolean registerRules(User user) {

		String regex = "^[A-Z0-9._+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$"; // check if it
																											// is a
																											// proper
																											// eamil
																											// address
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher control = pattern.matcher(user.getEmail());

		return user.getFirstName().length() > 2 && control.matches() && user.getLastName().length() > 2
				&& user.getPassword().length() > 6; // meet requirements
	}

	boolean emailCheck(User user) { // checks email. if email is not in data it will give error. if it is it will
									// register

		for (User user1 : userDao.getAll()) {
			if (user1.getEmail() == user.getEmail()) {
				System.out.println("Valid email");
				return false;
			}
		}
		return true;
	}

	boolean validationLink(User user) { // checks if user activate his email address

		if (userAuthorizationService.validation(user.getEmail()) == true) {
			System.out.println("Successfully activated your email address");
			return true;

		}
		return false;
	}

	@Override
	public boolean register(User user) {

		if (registerRules(user) && emailCheck(user)) {
			System.out.println("");
					if (validationLink(user)) {
							
							userDao.add(user);
							return true;
		} else {
			System.out.println("please activate your email address");
		}
		}
		
		System.out.println("Please enter valid input");
		return false;
	}

	@Override
	public void login(String email, String password) {

		for (User user1 : userDao.getAll()) { // check user1 info in userDao . if email and password exist let user in
			if (user1.getEmail() == email && user1.getPassword() == password) {
				System.out.println("logged in");
			}
		}
		System.out.println("check your email and password and try again");

	}

	@Override
	public void delete(User user) {
		userDao.delete(user); // delete user in userDao(Database)
      System.out.println(user.getFirstName()+ " USer deleted");
	}

	@Override
	public void update(User user) {
		userDao.update(user);// update user in userDao(Database)
		 System.out.println(user.getFirstName()+ " User updated");
	}

	@Override
	public List<User> getAll() {

		return userDao.getAll();
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

}
