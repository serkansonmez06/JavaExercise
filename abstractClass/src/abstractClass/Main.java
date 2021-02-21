package  abstractClass;

public class Main {

	public static void main(String[] args) {
		//
		ManGamePlayerCal manPlayer = new ManGamePlayerCal();
		
		manPlayer.calculate();
		
		
		BaseCalculator baseCalculator = new WomanPlayerCalculator();
		baseCalculator.calculate();
		
		
		BaseCalculator kidsPlayerCalculator = new KidsPlayerCalculator();
		kidsPlayerCalculator.gameOver();
				
	}

}

//abstract class must have abstract before class name
//when you abstract method, you create method and will override it. class doesnt have to have 
// abstract method
//Abstract class can not be instantiate. 
