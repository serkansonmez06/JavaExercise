 package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;


//created second layer
//Data Access Object/LAYER
public class HibernateUserDao implements UserDao{

   List<User> userArrayList = new ArrayList<User>();  // created user arraylist to keep every user in there.
	


	@Override
	public void update(User user) {
		
		
		
		User updatedUser; //instantiated entity User 
		
		
		for(User user1 : userArrayList ) {  // run for each to add every update inside userArrayList
			if (user1.getId() == user.getId()) { //userid and user1(saved in user1 arraylist) must match
				updatedUser = user1;
				updatedUser.setFirstName(user.getFirstName());
				updatedUser.setLastName(user.getLastName());
				updatedUser.setEmail(user.getEmail());
				updatedUser.setPassword(user.getPassword());
				
		}}
		
		
	}

	@Override
	public void delete(User user) {
		
		for (User user1: userArrayList) {
			if(user1.getId() == user.getId()) {
				
				User deletedUser = user1; //deletedUser will be inside userArryaList 
				userArrayList.remove(deletedUser);
			}
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		
		
		return userArrayList;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		for(User user1 : userArrayList) {
			if(user1.getId() ==id ) {
				return user1;
			}
		}
		
		return null;
	}


	public void add(User user) {
		System.out.println(user.getFirstName() );
		userArrayList.add(user);

	}
	

	
	
}
