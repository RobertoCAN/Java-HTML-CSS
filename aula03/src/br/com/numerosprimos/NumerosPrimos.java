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
		System.out.println("números primos até " + limiteSuperior);
		for (int i = 2; i <= limiteSuperior; i++) {
			if(verificarPrimalidade(i)) {
				System.out.println( i + " ");
			}
		}
		System.out.println();
	}
}