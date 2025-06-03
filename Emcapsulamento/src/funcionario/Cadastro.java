package funcionario;

import java.util.Scanner;

public class Cadastro {
	public static Funcionario inserir() {
		System.out.println("Digite o nome: ");
		Scanner nome = new Scanner(System.in);
		String nomeFun = nome.nextLine();
		
		System.out.println("Digite o salario: ");
		Scanner salario = new Scanner(System.in);
		Double salarioFun = salario.nextDouble();
		
		return new Funcionario(nomeFun, salarioFun);
	}

	
}
