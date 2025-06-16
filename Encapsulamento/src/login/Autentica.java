package login;

import java.util.Scanner;

public class Autentica extends User {

	Scanner scanner = new Scanner(System.in);
	int tentativasRestantes = 3;

	public Autentica(String login, String senha) {
		super(login, senha);
	}

	public void verifica() {
		while (tentativasRestantes > 0) {
			System.out.println("Digite o seu usuário: ");
			String usuario = scanner.nextLine();

			System.out.println("Digite a senha: ");
			String senha = scanner.nextLine();

			if (validarSenha(usuario, senha)) {
				System.out.println("Login bem-sucedido!");
				break;
			} else {
				tentativasRestantes--;
				if (tentativasRestantes == 0) {
					System.out.println("Acesso bloqueado. Contate o administrador.");
				} else {
					System.err.println("Usuáio ou senha incorreta! Tentativas restantes: " + tentativasRestantes);
				}

			}
		}
		scanner.close();
	}
	
}
