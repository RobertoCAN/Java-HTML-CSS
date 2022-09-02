package certificacao;

public class Pessoa {
	/**
	 * Variavel nome
	 * @author roberto.caetano
	 */
	String nome;
	int idade;
	/**
	 * Metodo para retornar o nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo para configurar o nome
	 * @param nome
	 */
	public void setNome(String nome, int idade) {
		this.nome = nome;
		System.out.println("Imprime o nome novamente.");
		imprime();
		System.out.println("fim");
	}
	
	public void imprime() {
		System.out.println(getNome());
	}
}
