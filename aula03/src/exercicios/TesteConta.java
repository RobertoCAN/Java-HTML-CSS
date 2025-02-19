package exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta(3145, "Arne Friedrich");
		Conta conta2 = new Conta(1234, "Lucas Podolski");
//		Conta conta3 = new Conta(3145, "Arne Friedrich");
//		Conta conta4 = new Conta(5452, "Phillip Lahm");
		
		ArrayList <String> lista = new ArrayList<String>();
		lista.add("Phillip Lahm");
		lista.add("Lucas Podolski");
		lista.add("Arne Friedrich");
		
		System.out.println(conta2.compareTo(conta1));
		
		Collections.sort(lista);
		
//		System.out.println(conta1.compareTo(conta4));
		System.out.println(lista);
	}

}
