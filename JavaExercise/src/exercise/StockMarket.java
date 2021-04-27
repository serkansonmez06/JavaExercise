package exercise;

public class StockMarket {
	
	public StockMarket() {
		System.out.println("Stocks");
	}
	
	public StockMarket(String name, double price) {
		this.name=name;
		this.price=price;
	}
	String name;
	double price;

	public void buy(StockMarket stockList) {
		System.out.println("Buy "+stockList.name);
		
	}
	public void sell(StockMarket stockList) {
		System.out.println("Sell "+stockList.name);
	}
}
