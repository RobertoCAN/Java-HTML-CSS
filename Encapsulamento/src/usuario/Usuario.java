package usuario;

public class Usuario {
	private String nome;
	private int pontos;
	private int nivel;

	public Usuario(String nome) {
		this.nome = nome;
		this.pontos = 0;
		this.nivel = 1;
	}

	public void ganharPontos(int quantidade) {
		this.pontos += quantidade;
		atualizarNivel();
	}
	
	private void atualizarNivel() {
		this.nivel = (pontos / 100) + 1;
	}
	
	public void exibirStatus() {
		System.err.println("Nome: " + nome);
		System.out.println("Pontos: " + pontos);
		System.out.println("Nivel: " + nivel);
	}
}
