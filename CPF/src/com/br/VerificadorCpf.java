package com.br;

import java.util.List;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.NITFormatter;
import br.com.caelum.stella.validation.CPFValidator;

public class VerificadorCpf {

	String formatedValue;

	public boolean valida(String cpf) {
		CPFValidator cpfValidator = new CPFValidator();
		List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf);
		if (erros.size() > 0) {
			return false;
		} else {
			Formatter formatter = new NITFormatter();
			this.formatedValue = formatter.format(cpf);
//			System.out.println(this.formatedValue);
			return true;
		}

	}

}
