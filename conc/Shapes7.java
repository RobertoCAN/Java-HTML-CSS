package conc;

public class Shapes7 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle("Contorno", 8.0, 12.0);
		
		//faz uma c�pia de t1
		Triangle t2 = new Triangle(t1);

		System.out.println("Informa��o t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("A area � " + t1.area());
		
		System.out.println();
		
		System.out.println("Informa��o t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("A area � " + t2.area());
	}

}
