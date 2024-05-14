package br.com.numerosprimos;

import java.util.Scanner;

public class TesteNumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumerosPrimos verificar = new NumerosPrimos();
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int numero = valor.nextInt();
		
			boolean resultado = verificar.verificarPrimalidade(numero);
			verificar.listarPrimos(numero);
		
		VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
		verificadorPrimo.vericarSeEhPrimo(numero);
		
		GeradorPrimo geradorPrimo = new GeradorPrimo();
		System.out.println("O proximo número após " + numero + " é " + geradorPrimo.gerarProximoPrimo(numero));
	}

}
