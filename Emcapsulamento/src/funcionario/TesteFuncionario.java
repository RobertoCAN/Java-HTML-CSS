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
			// Exibe as opções do menu
			System.out.println("\n----- MENU -----");
			System.out.print("Escolha uma opção: ");
			System.out.println("1. Para inserir o nome digite e cargo 1");
			System.out.println("2. Para inserir um cargo digite 2");
			System.out.println("0. Sair");

			// Lê a escolha do usuário
			escolha = scanner.nextInt();

			// Processa a escolha do usuário
			switch (escolha) {
			case 1:
				// Executa a ação da opção 1
				System.out.println("Insira o nome do funcionário");
				Scanner nome = new Scanner(System.in);
				String nomeFuncinario = nome.next();

				System.out.println("Insira o salário do funcionário");
				Scanner salario = new Scanner(System.in);
				int salarioFuncinario = salario.nextInt();

				funcionarios.add(new Funcionario(nomeFuncinario, salarioFuncinario));

				break;
			case 2:
				// Executa a ação da opção 2
				System.out.println("Você escolheu a Opção 2");
				break;
			case 3:
				// Executa a ação da opção 3
				System.out.println("Você escolheu a Opção 3");
				break;
			case 0:
				// Sai do programa
				System.out.println("Saindo do programa.");
				break;
			default:
				// Opção inválida
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (escolha != 0);

		// Fecha o Scanner
		scanner.close();

		funcionario.setCargo("Analista");

		System.out.println("Funcionário tem o cargo: " + funcionario.getCargo());
		System.out.println("Funcionário tem nome: " + funcionario.getNome());
		System.out.println("Funcionário tem o salário: " + funcionario.getSalario());

		funcionario.reajustarSalario(5);
		funcionario.reajustarSalario(15);
		funcionario.reajustarSalario(15);
		funcionario.equals(funcionario);
		
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println("Funcionário tem o cargo: " + funcionario.getCargo());
			System.out.println("Funcionário tem nome: " + funcionario.getNome());
			System.out.println("Funcionário tem o salário: " + funcionario.getSalario());	
		}
	}

}
