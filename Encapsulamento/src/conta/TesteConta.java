package conta;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do funionário:");
		String nome = scanner.next();
		
		String nomeFuncionario = nome;
		
		Conta conta = new Conta(nomeFuncionario);
		System.out.println("Digite o valor a depositar:");
		double valor = scanner.nextDouble();
		conta.depositar(valor);
		
		conta.exbirSaldo();
		
		System.out.println("Digite o valor a sacar:");
		double sacar = scanner.nextDouble();
		conta.sacar(sacar);
		
		conta.exbirSaldo();
	}

}
