package bateria;

public class TesteBateria {

	public static void main(String[] args) {
		Bateria bateria = new Bateria();

		bateria.setNivel(10);
		System.out.println("Status da bateria " + bateria.exibirStatus());


		bateria.setNivel(20);
		System.out.println("Status da bateria " + bateria.exibirStatus());
		

		bateria.setNivel(30);
		System.out.println("Status da bateria " + bateria.exibirStatus());
		

		bateria.setNivel(40);
		System.out.println("Status da bateria " + bateria.exibirStatus());
		

		bateria.setNivel(50);
		System.out.println("Status da bateria " + bateria.exibirStatus());
		

		bateria.setNivel(60);
		System.out.println("Status da bateria " + bateria.exibirStatus());
		

		bateria.setNivel(80);
		System.out.println("Status da bateria " + bateria.exibirStatus());
		

		bateria.setNivel(81);
		System.out.println("Status da bateria " + bateria.exibirStatus());
	}

}
