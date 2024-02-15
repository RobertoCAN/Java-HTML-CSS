package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("501"), 2);
		Orcamento segundo = new Orcamento(new BigDecimal("580"), 4);
		
		CalculadoraDeDesconto calculadoraDedesconto = new CalculadoraDeDesconto();
		System.out.println(calculadoraDedesconto.calcular(primeiro));
		System.out.println(calculadoraDedesconto.calcular(segundo));
		
	}
}
