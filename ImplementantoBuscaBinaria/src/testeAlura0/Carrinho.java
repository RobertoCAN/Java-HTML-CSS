package testeAlura0;

import java.util.ArrayList;

public class Carrinho {

	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void adicionaProduto(Produto produto) {
		if (produtos.size() <9) {
			produtos.add(produto);
			System.out.println("Produto inserido " + produto.getNome());
		} else {
			System.out.println("Carrinho cheio!");
		}
	}	
}
