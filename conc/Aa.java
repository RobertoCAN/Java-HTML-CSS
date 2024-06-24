package conc;

public class Aa {
	public static void main(String[] args) {

		int a = 10;
		int b = a;
		
		a = b + a ;
		
		System.out.println("a= "+a + ", b =" + b);
		
		//b = b;
		
		System.out.println("a= "+a + ", b =" + b);
		
		Bb x = new Bb();
		Bb y = x;

		y.v++;
		x.v++;

		Bb z = y;

		z.v--;

		System.out.println(x.v + y.v + z.v);

	}
}
