package mod3W2D1ML;

public class Calculator {

	public static void main(String[] args) {
		
		int add=addTwoNum(5,6);
		int sub=subtractTwoNum(9,5);
		int mul=multiplicationTwoNum(2,4);
		int div=divisionTwoNum(9,3);
		System.out.println(add);
		System.out.println(sub); 
		System.out.println(mul);
		System.out.println(div);
	}
	
	
public static int addTwoNum(int a, int b) {
	return a+b;
}
public static int subtractTwoNum(int a,int b) {
	return a-b;
}
public static int multiplicationTwoNum(int a,int b) {
	return a*b;
}
public static int divisionTwoNum(int a,int b) {
	return a/b;
}
}
