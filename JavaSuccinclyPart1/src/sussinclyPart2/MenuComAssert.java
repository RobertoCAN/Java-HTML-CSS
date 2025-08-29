package sussinclyPart2;

import java.util.Scanner;

public class MenuComAssert {
	Scanner scanner = new Scanner(System.in);

	private Object valor;

	public void menu_1(int valor) {
		if (valor == 1) {
			System.out.println("Digite um numero inteiro: ");
			this.valor = scanner.nextInt();
			assert this.valor instanceof Integer : "Erro: valor deveria ser Integer, mas não é!";
			System.out.println("Valor recebido com sucesso!" + this.valor);
			scanner.close();
		} else if (valor == 2) {
			System.out.println("Digite uma String inteiro: ");
			this.valor = scanner.nextLine();
			assert this.valor instanceof String : "Erro: valor deveria ser String, mas não é!";
			System.out.println("Valor recebido com sucesso!" + this.valor);
			scanner.close();
		}

	}
}
