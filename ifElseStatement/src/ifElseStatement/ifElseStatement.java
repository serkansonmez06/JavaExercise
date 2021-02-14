package ifElseStatement;

public class ifElseStatement {

	public static void main(String[] args) {
		

	
		
		// Morning Lab
		
//1- Write a Java program that display the larger of two integer
		
   int x=9;
   int y=29;
   
   if(x>y) {
	   System.out.println(x+" is larger than "+ y);
   } else {
	   System.out.println(y + " is larger than " + x);
   }
		
		
	
//2-Write an if/else statement for the following requirements:
		
  int grade=80 ;
  
  if(  100>= grade&& 90 <=grade) {
	  System.out.println("A");
  }if (80<=grade &&  grade<90){
	  System.out.println("B");
  }if(70<=grade &&  grade<80) {
	  System.out.println("C");
	}if(55<=grade &&  grade<70) {
		  System.out.println("D");
		}if(55>grade ) {
			  System.out.println("F");
			}
		
		
		
//3-Write a java  program that displays "Good Morning" if time is between 5AM-11:59
		
		  int time=2400 ;
		 
		 if(  5000>= time&& time >=1159) {
		  System.out.println("Good Morning");
		  }else if (1200<=time &&  time<1600){
		  System.out.println("Good Afternoon");
		  }else {
			  System.out.println("Hey There");
		  }
		
		
		//Afternoon Lab
		 
//1- Using a while loop, print each char of a string ‘Hello World’
		 
		String xyx="Hello World";
		int i=0;
		while(i<xyx.length()) {
	
			System.out.println(xyx.charAt(i));
			i++;
			
	}        
		
//2- Java Program to find duplicate characters in a String	
		
		String str = "w3schools";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int iy = 0; iy < str.length(); iy++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[iy] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
	            


//3-Use a while loop to add up the numbers 1 to 20 into one variable. Print out the sum at the end
		
		   int ser = 0;
		   int sum=0;
		   while(ser<20) {
		 
		       ser++;
		       sum = sum + ser;
		   
		   
		  }
		    System.out.println(sum);
		  }
	
// 4- Use a while loop to print out the even number from 1 to 20. 
	//(You'll need Modulus for this. And an IF Statement.) 
  
		int yok=1;{//should be here 
		
		while(yok<20) {
			yok++;
			if(yok%2==0) {
				System.out.println("even numbers= "+yok);
			}
		}
		 
// 5- Write a for loop for the given output: 1, 3, 5, 7, 9  == 2, 4, 6, 8, 10
		
	    for ( int y=1; y<= 10;y++)
			if(y%2==0) {
				System.out.println("even numbers= "+y);
			}else {System.out.println(" odd number " + y);}
	    
			
		
		
// 6-write a for loop that iterates between 0 and 10 and prints all even numbers. 
//  HINT: Read on Module/Remainder operator. 
		
		for(int x=0; x<10;x++) {
		if(x%2 == 1) {
			System.out.println("even numbers = "+ x);
		}
		
		
		}

// 7-Write a for loop that iterates from 1 - 20. Prints “prime” for all prime numbers,
		//“even” for all even numbers, and “odd” for all odd numbers.
		//Treat 2 as an even number and 1 & 3 as odd
		
		 for (int i = 1; i <= 20; i++) { 
		        if (i == 1 || i == 0) 
		            continue; 
		 
		       int  flag = 1; // A Flag is a boolean variable that signals when some condition exists in a program
		        for (int j = 2; j <= i / 2; ++j) 
		        { 
		            if (i % j == 0)
		            { 
		                flag = 0; 
		                break; 
		            } 
		        } 
	
		        if (flag == 1) 
		            System.out.print(i); 
		    } 
		
		
		
		for(int w=1; w<=20; w+=1){
			  if(w%2 ==1 && w%3==0 && w!=1){
			System.out.println("PRIME and ODD = "+w);
			}else if (w==2) {
				System.out.println("PRIME and even = "+w);
			}else if(w==3){
				System.out.println("PRIME and ODD = "+w);
			}else if(w%2 ==0){
				System.out.println("even = "+w);
			}else if(w%2 ==1 ) {
				System.out.println("ODD = "+w);
			}}


	}
}
