package br.com.teste;

public class CalculadoraImposto {

	private double totalImposto = 0;

	public void calcularImposto(Tributavel item, Produto produto) {
		this.totalImposto = item.getValorImposto() + produto.getValor();
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
