package exercise;

public class Main {

	public static void main(String[] args) {
		CarsCategory car = new CarsCategory();
		CarsCategory car1 = new CarsCategory(2020, "Honda", "Accord", 20000.00);
		CarsCategory car2 = new CarsCategory(2021, "Toyota", "Camry", 23000.00);
		CarsCategory car3 = new CarsCategory(2019, "BMW", "M3", 21000.00);

		CarsCategory[] dealer = { car1, car2, car3 };

		for (CarsCategory carList : dealer) {
			System.out.println(
					 carList.year + " " + carList.make + " " + carList.model + " "+"$"+ carList.price);

		}

		System.out.println("=======================================");

		Cities titleOfCapitols = new Cities();
		Cities europe = new Cities("Paris", "France", 49393993, 02342);
		Cities europe1 = new Cities("Ankara", "Turkey", 5939399, 12343);
		Cities northAmerica = new Cities("Boston", "USA", 4989292, 02112);

		Cities[] capitols = { europe, europe1, northAmerica };

		for (Cities listOfCapitols : capitols) {
			System.out.println(listOfCapitols.city + " - " + listOfCapitols.country + " - "
					+ listOfCapitols.population + " - " + listOfCapitols.zipCode);
		}
		
		System.out.println("=======================================");

		StockMarket stockmarket = new StockMarket();
		StockMarket stock = new StockMarket("Apple", 133);
		StockMarket stock1 = new StockMarket("Tesla", 703);

		StockMarket[] stockList = {
				stock,stock1
		};
		
		for (StockMarket portfolio : stockList) {
			System.out.println(portfolio.name + " "+"$"+portfolio.price);
			
		}
		
		
		stockmarket.buy(stock); //methods
		stockmarket.sell(stock1);
		stockmarket.sell(stock);
		
	
		
	}
	

}
