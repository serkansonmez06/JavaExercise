package gameCompany;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product();
		product.setName("FiFa");
		product.setPrice(100);
		
		
		Customer customer = new Customer();
		customer.setNationalityNumber("358263623");
		customer.setFirstName("Serkan");
		customer.setLastName("Sönmez");
		customer.setDateOfBirth(1983);
	
		
		Campaign campaign =new Campaign();
		campaign.setName("Buy one, get one FREE");
          
               
        CustomerManager customerManager = new CustomerManager(new MernisServiceAdaptor());
        customerManager.delete(customer);
        customerManager.add(customer);
        
         
        ProductManager productManager = new ProductManager();
 		productManager.sell(customer, product, campaign);;
	}

}
