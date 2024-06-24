package conc;

public class TestaCicloDeVidaCarro {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.ano = 5000;
		
		c.imprimeDados();;
		
		new Carro().ano = 3030;
		
		c = new Carro();
		c.modelo = "Fox";
		c.ano= 5985;
		c.imprimeDados();
		
	}

}
