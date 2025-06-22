package br.com.book;

import java.util.Scanner;

public class TesteTemperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Digite a temperatura em Celcius:");
			int celcios = scanner.nextInt();
			
			ConversaoTeperatura conversaoTeperatura = new ConversaoTeperatura(celcios);
			System.out.println(conversaoTeperatura.getFahrenheit());
			
		} catch (Exception e) {
			System.err.println("Valor inserido não é um número inteiro! " + e.getMessage());
		}
	}

}
