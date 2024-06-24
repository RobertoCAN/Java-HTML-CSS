package conc;

public class Aluno {

	private String nome;
	private String estado;
	private int idade;
	private boolean devedor;

	public Aluno(String nome, String estado, int idade, boolean devedor) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.idade = idade;
		this.devedor = devedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isDevedor() {
		return devedor;
	}

	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", estado=" + estado + ", idade=" + idade + ", devedor=" + devedor + "]";
	}
	
	

}
