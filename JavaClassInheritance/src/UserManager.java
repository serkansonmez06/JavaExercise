
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " New User Added");
	}

	public void delete(User user) {
		System.out.println("Deleted");
	}

	public void updated(User user) {
		System.out.println(user.getEmail() + " Updated");
	}

	public void addMultiple(User[] users) { // send multiple user(instructor and student)

		for (User user : users) {

			add(user);

		}

	}

}
