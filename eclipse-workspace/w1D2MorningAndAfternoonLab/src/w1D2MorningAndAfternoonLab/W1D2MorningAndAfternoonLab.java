package w1D2MorningAndAfternoonLab;

public class W1D2MorningAndAfternoonLab {

	public static void main(String[] args) {
		//Week1_Day2_MorningLab

//1- Write a method maxOfTwoNumbers that takes two numbers as arguments and returns the largest of them.
		 int twoMax=maxOfTwoNumbers(3,9);
		 System.out.println("max Of Two Numbers is = "+ twoMax);
	
//2-Write a function maxOfThree that takes three numbers as arguments and returns the largest of them.	
		
		int threeMax=maxOfThree(4,6,7);
		System.out.println("max Of Three is = " + threeMax);
		
		
		
//3- Write a function isCharacterAVowel that takes a character (i.e. a string of length 1) 
//   and returns true if it is a vowel,
//   false otherwise.
		String say=isCharacterAVowel("b");
		System.out.println("is Character A Vowel = " + say);
				   
//4- Write a function charCount that takes a string and returns the length of the string. 
		  
		   int  charCount= charCount("Serkan");
		   System.out.println("char Count(length) is = " + charCount);
		
//5-Write a function vowelCount that takes a String and returns the number of vowels in the String. 
//  add a check for the string to be of 10 or less characters. 	   
		   int word = vowelCount("serkan sonmez");
		   System.out.println("vowel Count is = "+word);
		   

	}
	public static int maxOfTwoNumbers(int a,int b) {
		int maxNum= Math.max(a, b);
		return maxNum;
	}
	public static int maxOfThree(int a, int b, int c) {
		 int maxNum1=Math.max(a, Math.max(b, c));
		return maxNum1;
		
	}
	
	public static String isCharacterAVowel(String a) {
		 if (a == "a" || a == "A" ||  a =="E"  || a =="e" ||  a =="O" || a == "o" || a =="U" || a  == "u")
		 {	return "it is Vowel";}
		 else {
				 
			 return "it is Constant";}
	}
	public static int charCount(String a) {
		
		return a.length();
	
    }
	public static int vowelCount(String a) {
		char [] chars=a.toCharArray(); // convert to string to char array equal to length of string 
		int sum=0;
		for(char c:chars) { // for each loop. c is mapping chars array and switch statement checks vowels and 
			switch(c) { //add to count.
			case 'a':
			case 'e':
			case 'i':
			case 'u':
				sum++;
			}
			
		}
		
		return sum;
	}

}
