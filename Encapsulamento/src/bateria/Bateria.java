package bateria;

public class Bateria {

	private int nivel;

	public Bateria() {
		// TODO Auto-generated constructor stub
	}

	public void setNivel(int nivel) {
		if (nivel >= 0 && nivel <= 100) {
			this.nivel = nivel;
		}
	}

	public int getNivel() {
		return nivel;
	}

	public String exibirStatus() {
		if (nivel <= 20) {
			System.out.println(nivel+"%");
			return "Bateria fraca";
		} else if (nivel <= 80) {
			System.out.println(nivel +"%");
			return "Bateria ok";
		} else {
			System.out.println(nivel+"%");
			return "Bateria cheia";
		}
	}

}
