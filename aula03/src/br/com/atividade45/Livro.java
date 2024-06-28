package br.com.atividade45;

import br.com.teste.Produto;

public class Livro extends Produto implements Calculavel {

	private String autor;

	@Override
	public double calcularprecoFinal() {
		// TODO Auto-generated method stub
		return preco * 0.9;
	}
}
