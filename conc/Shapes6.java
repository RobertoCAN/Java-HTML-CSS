package conc;

public class Shapes6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorTriangle t1 = new ColorTriangle("Azul", "Delineado", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("Vermelho", "preenchido", 2.0, 2.0);
		
		System.out.println("Informa��o t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("A area � " + t1.area());
		
		System.out.println();
		
		System.out.println("Informa��o t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("A area � " + t2.area());
		
	}

}
