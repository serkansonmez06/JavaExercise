package tryCatchExercise;

import java.util.Scanner;

public class FinallyStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println(scan.next());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			scan.close();
			System.out.println("final");
		}
	}

}
