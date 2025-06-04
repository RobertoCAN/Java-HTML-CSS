package produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produt p1 = new Produt();
		
		p1.setNome("Mouse");
		p1.setPreco(59.59);

		System.out.printf("Produto: %s\nPreço: %.2f\n", p1.getNome(), p1.getPreco() );
	}

}
