package filme;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class TesteFilme {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Filmes filmes = new Filmes(null);

		int nota;
		int key;
		do {

			System.out.println("\n----------MENU----------");
			System.out.println("Escolha uma opcao: \n");
			if (filmes.getTitulo() == null) {
				System.out.println("1: Para inserir o nome do filme.\n");
			}else {
				System.out.println("1: Para inserir o nome do filme.\n" + filmes.getTitulo());
			}
			System.out.println("2: Para inserir a avaliacao.\n");
			System.out.println("0: Para sair.\n");

			key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("Insira o nome do filme:\n");
				Scanner nome = new Scanner(System.in);
				String nomes = nome.next();

				filmes = new Filmes(nomes);

				break;

			case 2:
				System.out.println("Digite a nota:\n");
				nota = scanner.nextInt();
				filmes.adicionarAvaliacao(nota);

				break;

			default:
				break;
			}

		} while (key != 0);

//		filmes.adicionarAvaliacao(4);
//		filmes.adicionarAvaliacao(2);
//		filmes.adicionarAvaliacao(3);
//		filmes.adicionarAvaliacao(2);
//		filmes.adicionarAvaliacao(6);

		if (filmes.getTitulo() == null || filmes.calcularMedia() == 0) {
			
			System.out.println();
		} else {
			System.out.println(filmes.getTitulo() + " " + filmes.calcularMedia());
		}
	}

}
