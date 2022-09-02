package certificacao;

class Cliente {
	String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public boolean equals(Object o) {
		Cliente outro = (Cliente) o;
		return this.nome.equals(outro.nome);
	}
}

public class TestaComparacaoEquals {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Roberto");
		Cliente c2 = new Cliente("Guilherme");
		
		Cliente c3 = new Cliente("Guilherme");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(c2.equals(c3));
		System.out.println(c2.equals((Cliente)c3));
	}

}
