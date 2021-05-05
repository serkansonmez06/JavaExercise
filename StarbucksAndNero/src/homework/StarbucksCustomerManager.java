package homework;

public class StarbucksCustomerManager extends CustomerManager{

	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		// TODO Auto-generated constructor stub
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void save(Customer customer) {
		
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not valid Person");
		}
		
	};
	
	
	
}
