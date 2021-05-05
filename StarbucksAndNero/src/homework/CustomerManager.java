package homework;

public abstract class CustomerManager implements ICustmorService {
	
	
	@Override
	public void save(Customer customer) {
		System.out.println("Save to db :" + customer.getFirstName()+" "+customer.getLastName());
	};

}
