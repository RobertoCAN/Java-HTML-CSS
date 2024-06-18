package br.com.atividade4;

public class ConversorDeMoeda implements ConversaoFinanceira {

	@Override
	public void converterDolarParaReal(double quantidadeEmReais) {
		double cotacaoDollar = 5.41;
		double valorReal = quantidadeEmReais * cotacaoDollar;

		System.out.printf("O valor em reais é: R$ %.2f", valorReal);
	}
}
