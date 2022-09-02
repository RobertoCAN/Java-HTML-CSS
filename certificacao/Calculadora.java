package certificacao;

class Calculadora {
	public int soma(int... numeros) {
		System.out.println(numeros.length);
		
		int soma = 0;
		for(int i=0 ; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}
}

class TestaCalculadora{
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println(new Calculadora().soma( new int[]{23789,673482}));
		System.out.println(calculadora.soma(23789,673482));
		System.out.println(calculadora.soma(new int[] {3,3}));
		
	}
}