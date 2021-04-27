package exercise;

public class CarsCategory {
	
	public CarsCategory() {
		System.out.println("Inventory List");
	}
	

	public CarsCategory (int year, String make, String model, double price) {
		
		this.year=year;
		this.make=make;
		this.model=model;
		this.price=price;
	}
	int year;
	String make;
	String model;
	double price;
}
