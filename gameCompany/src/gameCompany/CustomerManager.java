package gameCompany;

public class CustomerManager implements ICustomerService{
	
	
	 ICustomerCheckService customerCheckService;
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		
		
		if(this.customerCheckService.checkIfrealPerson(customer)) {	
	    
			System.out.println("New Customer Added " + customer.getFirstName() + " " + customer.getLastName());
		}else{
			System.out.println("Invalid entry");
			}
	
		
	
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer Deleted : " + customer.getFirstName() + " "+ customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer info has been updated : " + customer.getFirstName() + " "+ customer.getLastName());
		
	}

}
