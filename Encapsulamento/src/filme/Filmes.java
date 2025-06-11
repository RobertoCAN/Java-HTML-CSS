package filme;

import java.util.ArrayList;

public class Filmes {
	private String titulo;
	private ArrayList<Integer> avaliacoes;
	
	public Filmes(String titulo) {
		this.titulo = titulo;
		this.avaliacoes = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void adicionarAvaliacao(int nota) {
		if (nota >= 1 && nota <= 5) {
			avaliacoes.add(nota);
		}else {
			System.out.println("Nota invalida. Insira um falor entre 1 e 5.");
		}
	}
	
	public double calcularMedia() {
		int soma = 0;
		for (int nota : avaliacoes) {
			soma += nota;
		}
		return (double) soma / avaliacoes.size();
	}
}
