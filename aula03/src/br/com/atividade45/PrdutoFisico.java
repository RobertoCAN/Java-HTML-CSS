package br.com.atividade45;

import br.com.teste.Produto;

public class PrdutoFisico extends Produto implements Calculavel{

	@Override
	public double calcularprecoFinal() {
		// TODO Auto-generated method stub
		return preco * 1.05;
	}

}
	

