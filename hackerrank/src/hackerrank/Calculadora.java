package hackerrank;

public class Calculadora {

	private Operacao operacao;
	
	public Calculadora(Operacao operacao) {
		this.operacao= operacao;
	}

	public int calcular(int numero1, int numero2) {
		return this.operacao.calcular(numero1, numero2);
	}
}
