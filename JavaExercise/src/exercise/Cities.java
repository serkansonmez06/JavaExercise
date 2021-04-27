package exercise;

public class Cities {
	
	public Cities() {
		System.out.println("Capitols");
	}
	
	public Cities (String city, String country, double population, int zipCode) {
		this.city=city;
		this.country=country;
		this.population=population;
		this.zipCode=zipCode;
		
	}
String city;
String country;
double population;
int zipCode;
}
