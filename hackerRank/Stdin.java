package hackerRank;

import java.util.Scanner;

public class Stdin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int myInt = scanner.nextInt();
		double dob = scanner.nextDouble();
		
		scanner.nextLine();
		String minhaString = scanner.nextLine();	
				
		scanner.close();
				
		System.out.println("Minha String " + minhaString);
		System.out.println("minha int " + myInt);
		System.out.println(dob);
		
		
	}

}
