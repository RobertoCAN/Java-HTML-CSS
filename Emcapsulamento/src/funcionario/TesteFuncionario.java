package funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int escolha = 2;

		Funcionario funcionario = new Funcionario(null, 0);


		ArrayList<Funcionario> lista = new ArrayList<>();

		do {

			System.out.println("\n----- MENU -----");
			System.out.print("Escolha uma opção: \n");
			System.out.println("1. Para inserir o nome digite e cargo 1");
			System.out.println("2. Alterar o valor");
			System.out.println("0. Sair");

			escolha = scanner.nextInt();
			switch (escolha) {
			case 1:

				System.out.println("Insira o nome do funcionário");
				Scanner nome = new Scanner(System.in);
				String nomeFuncinario = nome.next();

				System.out.println("Insira o salário do funcionário");
				Scanner salario = new Scanner(System.in);
				double salarioFuncinario = salario.nextDouble();

				funcionario = new Funcionario(nomeFuncinario, salarioFuncinario);
				lista.add(funcionario);
				break;
			case 2:
				funcionario.reajustarSalario(escolha);
			break;
			case 0:

				System.out.println("Saindo do programa.");
				break;
			default:

				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (escolha != 0);

		lista.forEach(System.out::println);
		

	}
}