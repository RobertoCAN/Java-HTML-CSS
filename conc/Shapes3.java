package conc;

public class Shapes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle("�rea", 4, 4);
		Triangle t2 = new Triangle("Borda", 8, 12);
		Triangle t3 = new Triangle(4.0);
		
		System.out.println("Informa��o para t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("�re � " + t1.area());
		
		System.out.println();
		
		System.out.println("Informa��o para t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("�rea � " + t2.area());
		
		System.out.println();
		
		System.out.println("Informa��o para o t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area � " + t3.area());
	}

}
