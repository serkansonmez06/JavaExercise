package gameCompany;

public interface IProductSales {

	void sell(Customer customer, Product product,Campaign campaign);
	void cancel(Customer customer, Product product);
	void refund(Customer customer, Product product);
	
}
