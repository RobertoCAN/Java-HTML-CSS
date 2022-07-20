package com.br;

import javax.swing.JOptionPane;

public class Cpf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cpf = JOptionPane.showInputDialog(null,"Informe o CPF para verificação:","CPF", JOptionPane.INFORMATION_MESSAGE);
		

		VerificadorCpf valida = new VerificadorCpf();

		boolean valor = valida.valida(cpf);
	
		if (valor) {
			JOptionPane.showMessageDialog(null, "CPF " + valida.formatedValue + " valido!");
//			System.out.println("Cpf Valido");
			
		} else {
			JOptionPane.showMessageDialog(null, "CPF invalido!");
//			System.out.println("Cpf Invalido");
			
		}

	}

}
