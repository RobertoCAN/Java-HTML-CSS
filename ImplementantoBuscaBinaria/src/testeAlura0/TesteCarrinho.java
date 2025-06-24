package testeAlura0;

public class TesteCarrinho {

	public static void main(String[] args) {
		
		String produtos[] = {"Arroz","Macarrão","Feijão","Escova de dentes","Escova","barbeador","Tijela","Espelho","Faca","Palha de aço","Carne","Biscoitp","Pão"};
		Produto produto = new Produto();
		Carrinho carrinho = new Carrinho();
		for (int i = 0; i < produtos.length; i++) {
			produto.setNome(produtos[i]);
			carrinho.adicionaProduto(produto);
		}
		
			
		
	}
}
