package mod3Week1Day2AfternoonLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Mod3Week1Day2AfternoonLab {

	public static void main(String[] args) {
		
		// 1- What is an efficient way to create an array for first 50 integers?
		
		int[] testArray = new int[51];

		for (int i = 0; i < testArray.length; i++) {  
		    testArray[i]=i;
		    
		    System.out.println(testArray[i]);
		}
			
	// 2- You've been tasked to do this week's grocery shopping. As you arrive at 
	//	Times Supermarket, Kanye pings you to get a bottle of Hendricks gin. 
	//	Add this to the existing shoppingList.*/
	//  shoppingList = [  "cool ranch doritos",  "kings hawaiian sweet bread",  "peanut butter oreos",  
	//	"fruit loops cereal"  ];

		    ArrayList<String> shoppingList = new ArrayList<String>();
		    shoppingList.add("cool ranch doritos");
		    shoppingList.add("kings hawaiian sweet bread");
		    shoppingList.add("peanut butter oreos");
		    shoppingList.add("fruit loops cereal");
		    
		    System.out.println("Existing Shopping List "+shoppingList);
		    
		    shoppingList.add("Hendricks gin");
		                  		
		    System.out.println("New Shopping List "+shoppingList);
	
		    
		    
	//3 - Use the force, or in this case the reverse method to help Yoda make some 
    //    sense with his motivational talk to the young Jedi interns.*/
   //     yoda = ["try", "no", "is", "there", "not", "do", "or", "do"];
		    
		    ArrayList<String> yoda = new ArrayList<String>();
		    
		    yoda.add("try");
		    yoda.add("no");
		    yoda.add("is");
		    yoda.add("there");
		    yoda.add("not");
		    yoda.add("do");
		    yoda.add("or");
		    yoda.add("do");
		    
		    System.out.println(yoda);
		    
		    Collections.reverse(yoda);
		    System.out.println(yoda);
		    
	// 4 People been lining up for hours to get the newest iphone release.
    //	 Help manage the unruly crowd of privileged customers by serving them one at a 
	//	 time and assigning it to a variable named `nowServing`. Print this new variable as well as the waitList.
	//	 waitList = [ "Chance the Rapper", "Khalid", "Tay-Tay", "Barry Manilow", "Piko Taro" ]; 
		    
		    HashMap<String, Integer> waitList = new HashMap<String, Integer>();    
		    
		    waitList.put("Chance the Rapper",1);
		    waitList.put("Khalid",2);
		    waitList.put("Tay-Tay",3);
		    waitList.put("Barry Manilow",4);
		    waitList.put("Piko Taro",5);
		   
		    System.out.println(waitList);
		    
		}

	}


