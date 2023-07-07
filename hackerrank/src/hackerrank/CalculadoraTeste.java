package hackerrank;

public class CalculadoraTeste {

	public static void main(String[] args) {
		int resultado = new Calculadora(new Soma()).calcular(10, 30);
		System.out.println(resultado);
		
		resultado = new Calculadora(new Subtracao()).calcular(10, 30);
		System.out.println(resultado);
		
		resultado = new Calculadora(new Multiplicacao()).calcular(10, 30);
		System.out.println(resultado);
		
		resultado = new Calculadora(new Divisao()).calcular(10, 30);
		System.out.print(resultado);
	}

}
