package openDoor;

import java.util.Random;
import java.util.Scanner;

public class TesteOpenDoor {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		int portaComCarro = r.nextInt(3)+1;
		int selecao;
		
		System.out.println("Existem tr�s portas na sua frente\n"+
				"Atr�s de duas portas, voc� ir� encontrar uma cabra, mas \n"+
				"atr�s da terceira porta, existe um carro novo como pr�mio");
		
		System.out.println("Qual porta voc� escolhe:");
		selecao= scanner.nextInt();
		
		OpenDoor openDoor = new OpenDoor(selecao, portaComCarro);
	
		System.out.print(portaComCarro);
	}

}
