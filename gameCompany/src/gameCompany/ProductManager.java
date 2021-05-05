package gameCompany;

public class ProductManager implements IProductSales{


	@Override
	public void sell(Customer customer, Product product, Campaign campaign) {
		System.out.println( campaign.getName()+" Coupon applied for " +product.getName() + " : " +" buyer's name "+ customer.getFirstName());
		
	}

	@Override
	public void cancel(Customer customer, Product product) {
		System.out.println( product.getName() + " " +" Canceled for "+ customer.getFirstName());
		
	}

	@Override
	public void refund(Customer customer, Product product) {
		System.out.println( customer.getFirstName() + "get refund for "+ product.getName());
		
	}

}
