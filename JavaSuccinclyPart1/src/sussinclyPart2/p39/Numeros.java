package sussinclyPart2.p39;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Numeros {

	Set<Integer> numerosUnicos = new HashSet<>();
	Random random = new Random();
	
	double x;
	
	public Numeros(double x) {
		this.x = x;
		System.out.printf("%.0f",this.x);
	}
	
	public void pegandoValorArray(int entrada) {
		
		while(numerosUnicos.size() < entrada) {
			int numeroAleatorio = random.nextInt(50);
			numerosUnicos.add(numeroAleatorio);
		}
		
		Integer[] arrayFinal = new Integer[entrada];
		int iniciando = 0;
		
		for (Integer numero : numerosUnicos) {
			arrayFinal[iniciando++] = numerosUnicos;
			
		System.out.println("Impressão do array: ");
		
		for (int i : arrayFinal) {
			System.out.println(i + " ");
		}
		}
	}
	
}
