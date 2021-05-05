package homework;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
	
       CustomerManager customerManager = new NeroCustomerManager();
       
       CustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdaptor());
       
       
		Customer customer = new Customer();
		
		
		customer.setNatiolnalityId("1234567890");
		customer.setFirstName("Serkan");
		customer.setLastName("Sönmez");
		customer.setDateOfBirth(1983);

		
		customerManager1.save(customer);
		//customerManager.save(customer);
	
		
		
	

		
		
		
	}

}
