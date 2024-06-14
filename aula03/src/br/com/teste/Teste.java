package br.com.teste;

public class Teste {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setNome("Pasta de amendoin.");
		produto.setValor(22);
		double totalImposto = produto.getValorImposto();
		
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		calculadoraImposto.calcularImposto(produto, produto);
		double total = calculadoraImposto.getTotalImposto();
		
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Total do imposto: " + totalImposto);
		System.out.println("Total: " + total);

	}

}
