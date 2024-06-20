package br.com.atividade43;

public class TabuadaMultiplicacao implements Tabuada{

	@Override
	public void mostrarTabuada(int numero) {
		// TODO Auto-generated method stub
		System.out.println("Tabuada de mútiplicação do " + numero + ":");
		
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}
}
