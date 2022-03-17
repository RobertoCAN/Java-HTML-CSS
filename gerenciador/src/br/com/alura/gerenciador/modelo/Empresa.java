package br.com.alura.gerenciador.modelo;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	int num = 14_155_168;
	int num2 = 10_000;
	private Date dataAbertura = new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public void imprime() {
		System.out.println(getNome());
		System.out.println(num +" "+ num2);
	}
	

}
