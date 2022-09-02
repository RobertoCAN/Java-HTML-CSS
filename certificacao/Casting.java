package certificacao;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 50.6;
		int x1 =(int) valor;
		System.out.println(x1);
		
		long val = 1254345345353L;
		int a =(int) val;
		System.out.println(a);
		
		float val2 = 154315465135155F;
		int b = (int) val2;
		System.out.println(b);
		
		int i1 = 3/2;
		double i2 = 3/2;
		double i3 = 3/2.0;

		long x = 0; double d = 0;
		double zero = x + d;
		System.out.println(i1 + i2 + i3 + x + d + zero);
		
		char h = 'a';
		System.out.println(("Roberto Caetano").length());

	}

}
