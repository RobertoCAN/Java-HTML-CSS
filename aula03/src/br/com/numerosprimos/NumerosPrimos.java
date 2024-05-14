package br.com.numerosprimos;

public class NumerosPrimos {

	public boolean verificarPrimalidade(int numero) {
		try {
			if(numero <=1) {
				return false;
			}
			for (int i = 2; i * i <=  numero; i++) {
				if (numero % i == 0) {
					return false;
				}
			}
		}catch(Exception e) {
			e.getMessage();
		}
		return true;			
	}
	
	public void listarPrimos(int limiteSuperior) {
		if(verificarPrimalidade(limiteSuperior)) {
			System.out.println("� um n�mero primo");
		}else {
			System.out.println("N�o � um n�mero primo");
		}
		System.out.println("n�meros primos at� " + limiteSuperior);
		for (int i = 2; i <= limiteSuperior; i++) {
			if(verificarPrimalidade(i)) {
				System.out.print( i + " ");
			}
		}
		System.out.println();
	}
}