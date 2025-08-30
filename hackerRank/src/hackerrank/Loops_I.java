package hackerrank;

import java.util.Scanner;

public class Loops_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int multiplicar = scanner.nextInt();
	        scanner.close();
	        for (int x = 1; x <= 10; x++) {
	            System.out.format("%d x %d = %d%n", multiplicar, x , x * multiplicar);
	        }
	}
}
