package br.com.alura.rh;


import java.math.BigDecimal;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal salario01 = new BigDecimal(1000);
		BigDecimal reajusteSalario = new BigDecimal(500);
		
		Funcionario numerUm = new Funcionario("Roberto", "2121212", Cargo.ANALISTA, salario01);
		
		
		System.out.println(numerUm.getSalario() +" "+ numerUm.getCargo());
		
		numerUm.reajustarSalario(reajusteSalario);
		System.out.println(numerUm.getDataUltimoReajuste() +" "+ numerUm.getSalario());
		
	}

}
