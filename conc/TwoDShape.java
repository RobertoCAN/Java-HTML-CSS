package conc;

class TwoDShape {

	private double largura, altura;

	TwoDShape() {
		largura = altura = 0.0;
	}

	public TwoDShape(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	TwoDShape(double x) {
		largura = altura = x;
	}

	TwoDShape(TwoDShape ob) {

		largura = ob.largura;
		altura = ob.altura;

	}

	/**
	 * @return the largura
	 */
	public double getLargura() {
		return largura;
	}

	/**
	 * @param largura the largura to set
	 */
	public void setLargura(double largura) {
		this.largura = largura;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	void showDim() {
		System.out.println("Largura e altura são " + largura + " e " + altura);
	}

}
