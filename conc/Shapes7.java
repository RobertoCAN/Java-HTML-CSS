package conc;

public class Shapes7 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle("Contorno", 8.0, 12.0);
		
		//faz uma cópia de t1
		Triangle t2 = new Triangle(t1);

		System.out.println("Informação t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("A area é " + t1.area());
		
		System.out.println();
		
		System.out.println("Informação t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("A area é " + t2.area());
	}

}
