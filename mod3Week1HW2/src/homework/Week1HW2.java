package homework;

import java.util.*;

public class Week1HW2 {

	
	//  Write a Java program to copy one array list into another
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Mercedes");
	
		System.out.println("Before copied automobile to cars " + cars);
        ArrayList<String> automobile =new ArrayList<String> ();
        
        automobile.add("Nissan");
        automobile.add("Fiat");
        
        Collections.copy(cars, automobile); // copying automobile arrayList to the cars array list
        
        System.out.println("After copied automobile to cars " + cars);
        
        
      //Write a Java program to extract a portion of a array list  
        
        ArrayList<String> tree = new ArrayList<String>();
        
        tree.add("oak");
        tree.add("blossem");
        tree.add("rose");
        System.out.println("Before extraction " + tree);
        
        tree.subList(0, 2);//index from beginning and ending
        
        List<String> newTree =tree.subList(0, 2); // create a List with new variable and call tree variable with subList
        
        System.out.println("Before extraction " + newTree);
    
       // Write a Java program of swap two elements in an array list
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(1);
        number.add(2);
        number.add(6);
        number.add(10);
        number.add(3);
        
        System.out.println("Before swaping "+number);
        
        Collections.swap(number, 2, 4); //added index number 
        
        System.out.println("After swaping "+number);
        
        // Write a Java program to test an array list is empty or not
        
        ArrayList<String> words = new ArrayList<String>();
        
          Boolean check  = words.isEmpty(); //checks if arrayList empty or not= returns boolean
          
          System.out.println(check);
         
        // Write a Java program to replace the second element of a ArrayList with the specified element.
       
        ArrayList<String> books = new ArrayList<String>();
        
        books.add("justice");
        books.add("little prince");
        
        System.out.println("before replacing elements "+ books);
        
        String book1 = "Value migration";
        books.set(1, book1); // replaced little prince with value migration
        
        System.out.println("after replacing elements "+ books);
        
        // Write a Java program to trim the capacity of an array list the current list size
        
        ArrayList<String> phones = new ArrayList<String>();
        
        phones.add("Iphone3");
        phones.add("Galaxy");
        phones.add("Iphone7");
        phones.add("Iphone2");
        phones.add("Galaxy7");
        
        System.out.println("Before the triming " +phones);
        
       phones.trimToSize();
       
       System.out.println("After the triming " +phones);
        
       // Write a Java program to test a hash set is empty or not.

        HashSet<String> drinks = new HashSet<String>();
        
        drinks.add("coke");
        drinks.add("water");
        drinks.add("orange juice");
        
        System.out.println("HashSet elemets " + drinks);
        
        Boolean hashSetCheck = drinks.isEmpty();
        System.out.println("Check if HashSet is empty or not return boolean => " + hashSetCheck);
        
        // Write a Java program to get the number of elements in a hash set
        
        HashSet<String> colors = new HashSet<String>();
        
        colors.add("blue");
        colors.add("black");
        colors.add("yellow");
        
        int numberOfHashSet = colors.size();
        System.out.println("number of HashSet elemnt => " + numberOfHashSet);
        
        // Write a Java program to iterate through all elements in a hash list.
        
        HashSet<String> electronics = new HashSet<String>();
        
        electronics.add("TV");
        electronics.add("Phone");
        electronics.add("Fridge");
        electronics.add("Vacuum");
        
        Iterator<String> ElectronicsIteration =electronics.iterator(); 
        
        while(ElectronicsIteration.hasNext()) { // 
        	   System.out.println(ElectronicsIteration.next());
        }
     
        // Write a Java program to convert a hash set to an array.
        
        HashSet<String> numbers83 = new HashSet<String>();
        
        numbers83.add("one");
        numbers83.add("two");
        numbers83.add("four");
        numbers83.add("ten");
        
        System.out.println("HashSet " + numbers83);
        
        ArrayList<String> arr = new ArrayList<String>(numbers83);
        
        System.out.println("Converted from HashSet to ArrayList " + numbers83);
        
        // Write a Java program to compare two sets and retain elements which are same on both sets.

          HashSet<String> days = new HashSet<String>(); // first hasSet 
          
          days.add("Monday");
          days.add("Tueday");
          days.add("Friday");
          days.add("Sunday");
          
          System.out.println( "First HashSet " + days);
          
          HashSet<String> days1 = new HashSet<String>(); // second hasSet
          
        
          days1.add("Tuesday");
          days1.add("Saturday");
          days1.add("Monday");
         
          
          days.retainAll(days1); // compare HashSet
          System.out.println("Compare HashSet " + days);

	} 

}
