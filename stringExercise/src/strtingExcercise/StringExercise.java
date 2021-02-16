package strtingExcercise;

public class StringExercise {

	public static void main(String[] args) {
    
		
		//************************************************
		
		String message = "    Hello World   ";
		
		
		System.out.println(message);
		System.out.println( "length " +message.length());
		System.out.println("Char at "+message.charAt(4));
		System.out.println("Concate " + message.concat(" Serkan"));
		System.out.println(message.startsWith("h")); // caseSensetive
		System.out.println(message.endsWith("d"));
		
		char [] chars = new char[5];
		message.getChars(0, 5, chars,0);
        System.out.println(chars);
        
        System.out.println(message.indexOf("orl")); // it will return first match and returns 
		System.out.println(message.lastIndexOf("d"));
		
		//****************************************************************
		
		System.out.println(message.replace(' ','/'));
		System.out.println(message.substring(0,6));
		
		for(String newWords: message.split("")) {
			System.out.println(newWords);
		}
		
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		
		//****************************************************************
		
		char letter='B';
		switch (letter) {
		case'A':
		case'E':
		case'I':
		case'O':
			System.out.println("vowel");
			break;
		default:
				System.out.println("constant");
		}
		
		//****************************************************************
		
		
		int number =21 ;
		int total = 0;
		
		for (int i=1; i<number;i++) {
			if(number % i == 0) {
			total = total +i;
			}
		}if (total == number) {
			System.out.println("it is a perfect num");
		}else {
			System.out.println("it is not a perfect num");
		}
		
		//****************************************************************
		
		//220 -284
		
		int num1 = 220;
		int num2 = 284;
		int sum = 0;
		int sum1 = 0;
		
		for(int i =1 ;i<num1 ; i++) {
			if(num1 % i ==0 ) {
			sum = sum +i;
		}
		
		
	}
		for(int i =1 ;i<num2 ; i++) {
			if(num2 % i ==0 ) {
			sum1= sum1 +i;
		}
			
		}
		if(num1== sum1 && num2 == sum  ) {
			
			System.out.println("friends num");
		}else {
			System.out.println("not friends");
		}
		//****************************************************************
		
		int [] numbers = new int [] {1,2,3,4,5,7,9,10};
		
		int find =11;
		boolean isThere= false;
		
		for (int numb : numbers ) {
			if(numb ==find) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("there is num");
		}else {
			System.out.println("there is not");
		}
		//*********************Methods*************************************
		
		add();
		delete();
		update();
		
		
		
		
	}
    public static void add() {
    	System.out.println("added");
    }
    public static String delete() {
    	return "deleted";
    }
    public static void update() {
    	System.out.println("updated");
    }	
    	//****************************************************************
    
}
