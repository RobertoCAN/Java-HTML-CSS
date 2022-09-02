package certificacao;

public class Carro {
	String modelo;
	int ano, preco;
	String desc;

	public Carro() {
		ano = 2014;
	}

	
	
	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public void metodo(Carro c) {
		if(c != null && c.getPreco() > 10000)
			System.out.println("\"Valor mairo que 1000\" \\0/");
	}

	void reseta() {
		ano = 2014;
	}

	public String getDadosdeImpressao() {
		return modelo + "::" + ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
