package conc;

public class Shapes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle("Área", 4, 4);
		Triangle t2 = new Triangle("Borda", 8, 12);
		Triangle t3 = new Triangle(4.0);
		
		System.out.println("Informação para t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Áre é " + t1.area());
		
		System.out.println();
		
		System.out.println("Informação para t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Área é " + t2.area());
		
		System.out.println();
		
		System.out.println("Informação para o t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area é " + t3.area());
	}

}
