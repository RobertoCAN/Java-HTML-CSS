package conc;

public class Truck extends Vehicle{
	
	private int capacideCarga; //capacidade de carga em libras

	public Truck(int passageiros, int totalTanque, int consumo, int capacideCarga) {
		super(passageiros, totalTanque, consumo);
	
		this.capacideCarga = capacideCarga;
	}

	/**
	 * @return the cargocap
	 */
	public int getCarga() {
		return capacideCarga;
	}

	void putCarga(int c) {
		capacideCarga = c;
	}
}