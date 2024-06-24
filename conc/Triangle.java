package conc;

class Triangle extends TwoDShape {

	private String style;

	public Triangle() {
		super();
		style = "nenhum";

	}

	public Triangle(String s, double w, double h) {
		super(w, h);

		style = s;
	}

	public Triangle(Double x) {
		super(x);

		style = "preenchido";
	}

	//constroi um objeto a apartir de outro
	Triangle(Triangle ob) {
		super(ob);//passa o objeto para o construtor de TwoDShape
		style = ob.style;
	}

	double area() {
		return getLargura() * getAltura() / 2;
	}

	void showStyle() {
		System.out.println("Triangulo é " + style);
	}

}
