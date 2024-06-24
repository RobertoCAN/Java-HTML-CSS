package conc;
//

//
//Classe veículo para caminhões

public class Vehicle {

	private int passageiros;// número de passageiros
	private int totalTanque;// capacidade de armazenamento de combustível
	private int consumo; // consumo de combustível

	public Vehicle(int p, int f, int m) {
		this.passageiros = p;
		this.totalTanque = f;
		this.consumo = m;
	}

	// retorno da autonomia
	int range() {
		return consumo * totalTanque;
	}

	//Combustivel necessário para uma dada distancia
	double CombustivelNecessario(int miles) {
		return (double) miles / consumo;
	}
	
	//Metodos de acesso de variáveis de intância.
	public int getPassengeiros() {
		return passageiros;
	}

	public void setPassengeiros(int passengers) {
		this.passageiros = passengers;
	}

	public int getCapacidadeTanque() {
		return totalTanque;
	}

	public void setCapacidadeTanque(int fuelcap) {
		this.totalTanque = fuelcap;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int mpg) {
		this.consumo = mpg;
	}

}
