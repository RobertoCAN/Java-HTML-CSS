package certificacao;

class Calculadore {
	
}

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Roberto", 42);		

		System.out.println(p.getNome());
		System.out.println(p);
		p.imprime();
	}

}
