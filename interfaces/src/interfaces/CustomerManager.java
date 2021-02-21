package interfaces;

public class CustomerManager {
	 private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	
	public void add() {
		//business layer will use in here
		customerDal.add();
		
	}

}
