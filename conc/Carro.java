package conc;

public class Carro {

	String modelo;
	int ano;

	public Carro() {
		ano = 2014;
	}

	void reserva() {
		ano = 2014;
	}

	public String getDadosDeImpressao() {

		return modelo + "::" + ano;
	}

	public void setmodelo(String modelo) {
		modelo = modelo;
	}

	public void imprimeDados() {
		System.out.println(modelo + " " + ano);
	}

}
