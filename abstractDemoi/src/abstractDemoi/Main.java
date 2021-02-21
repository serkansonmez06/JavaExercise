package abstractDemoi;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.dataBaseManager = new MySQLDataBaseManager();
		customerManager.getCustomer();
		
	}

}
