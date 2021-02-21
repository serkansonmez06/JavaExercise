package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MysqlCustomerDataAccessLayer());
		
		customerManager.add();
      
	}

}
//interfaces are not class, they just hold the referance
//interface can implement more than interface.
//it can still extends a class