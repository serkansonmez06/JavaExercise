package tryCatchExercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catch {

	public static void main(String[] args) {
//		try {
//			int [] a = {4,5,6};
//			System.out.println(a[3]);
//			
//		}catch(Exception a) {
//			System.out.println("an exception ");
//		}
		System.out.println("whats ur fav num ");
		
		Scanner scan = new Scanner (System.in);
		scan.close();
//		int num = scan.nextInt();
//		System.out.println(num);
		
		try {
			int number = scan.nextInt();
			System.out.println(number);
		}catch(InputMismatchException e ) {
			System.out.println("this is the input mismatch");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("this is finally statement");
		}
	}

}
