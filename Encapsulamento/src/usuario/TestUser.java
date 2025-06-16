package usuario;

public class TestUser {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Roberto");
		
		usuario.ganharPontos(120);
		usuario.exibirStatus();

	}

}
