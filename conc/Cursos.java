package conc;

import java.math.BigDecimal;

public class Cursos {

	private String nome;
	private BigDecimal valor;
	
	
	public Cursos(String nome, BigDecimal valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
}
