package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	
    List<User> getAll();//for to store all user
    
    
    User getById(int id);
	
}
