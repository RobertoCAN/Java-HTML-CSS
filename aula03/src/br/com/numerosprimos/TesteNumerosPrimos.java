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
			System.out.println(resultado);
	}

}
