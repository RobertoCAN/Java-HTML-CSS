package conc;

import java.util.ArrayList;

public class TestaException {
	public static void main(String[] args) {
		try {
			int[] x = new int[56];
			x[56]=13; 			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			ArrayList<String> test = new ArrayList<String>();
			test.add("Roberto");
			test.add("Roberto");
			test.get(2);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		String s = new String();
		s.length();
	}
}
