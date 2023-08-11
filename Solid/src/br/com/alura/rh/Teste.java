package br.com.alura.rh;


import java.math.BigDecimal;
import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal valorVerificador = new BigDecimal("0.5");
		BigDecimal valor = new BigDecimal("0.4");
		
//		System.out.println(valorVerificador.compareTo(new BigDecimal("0.5")) == 0);
		System.out.println(new BigDecimal("1").compareTo(new BigDecimal("1")) >= 0);
		
		if (valor.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		
		
		System.out.println(valor);
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		
		
	}

}
