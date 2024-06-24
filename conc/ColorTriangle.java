package conc;

public class ColorTriangle extends Triangle {

	private String color;

	public ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);
		
		color = c;
	}
	
	String getColor() {
		return color;
	}
	
	void showColor() {
		System.out.println("Cor � " + color);
	}
	
}
