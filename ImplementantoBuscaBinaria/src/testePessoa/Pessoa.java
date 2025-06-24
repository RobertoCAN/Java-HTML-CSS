package testePessoa;

public class Pessoa {

	private String nome;
	private int idade;
	public int contador = 0;
	
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
			return "Pessoa : " + nome + "Idade: " + idade;
	}
}
