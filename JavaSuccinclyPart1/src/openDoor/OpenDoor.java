package openDoor;

public class OpenDoor {

	public int selecaoPorta = 0;

	public OpenDoor(int selecaoPorta, int portaComCarro) {
		if (selecaoPorta < 1 || selecaoPorta > 3) {
			System.out.println("As portas s�o 1, 2 ou 3...");
			selecaoPorta = 0;
		} else if (selecaoPorta == portaComCarro){
			System.out.println("Sim, voc� ganhou o carro!!!");
		}else {
			System.out.println("N�o, isto � uma cabra... ");
			selecaoPorta = 0;
		}

	}
}
