package funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		int escolha;


		Funcionario funcionario = new Funcionario("Roberto", 15000);

		do {
			// Exibe as op��es do menu
			System.out.println("\n----- MENU -----");
			System.out.print("Escolha uma op��o: ");
			System.out.println("1. Para inserir o nome digite e cargo 1");
			System.out.println("2. Para inserir um cargo digite 2");
			System.out.println("0. Sair");

			// L� a escolha do usu�rio
			escolha = scanner.nextInt();

			// Processa a escolha do usu�rio
			switch (escolha) {
			case 1:
				// Executa a a��o da op��o 1
				System.out.println("Insira o nome do funcion�rio");
				Scanner nome = new Scanner(System.in);
				String nomeFuncinario = nome.next();

				System.out.println("Insira o sal�rio do funcion�rio");
				Scanner salario = new Scanner(System.in);
				int salarioFuncinario = salario.nextInt();

				funcionarios.add(new Funcionario(nomeFuncinario, salarioFuncinario));

				break;
			case 2:
				// Executa a a��o da op��o 2
				System.out.println("Voc� escolheu a Op��o 2");
				break;
			case 3:
				// Executa a a��o da op��o 3
				System.out.println("Voc� escolheu a Op��o 3");
				break;
			case 0:
				// Sai do programa
				System.out.println("Saindo do programa.");
				break;
			default:
				// Op��o inv�lida
				System.out.println("Op��o inv�lida. Tente novamente.");
			}
		} while (escolha != 0);

		// Fecha o Scanner
		scanner.close();

		funcionario.setCargo("Analista");

		System.out.println("Funcion�rio tem o cargo: " + funcionario.getCargo());
		System.out.println("Funcion�rio tem nome: " + funcionario.getNome());
		System.out.println("Funcion�rio tem o sal�rio: " + funcionario.getSalario());

		funcionario.reajustarSalario(5);
		funcionario.reajustarSalario(15);
		funcionario.reajustarSalario(15);
		funcionario.equals(funcionario);
		
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println("Funcion�rio tem o cargo: " + funcionario.getCargo());
			System.out.println("Funcion�rio tem nome: " + funcionario.getNome());
			System.out.println("Funcion�rio tem o sal�rio: " + funcionario.getSalario());	
		}
	}

}
