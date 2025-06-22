package br.com.book;

public class ConversaoTeperatura {

	private int fahrenheit;

	public ConversaoTeperatura(int fahrenheit) {

		this.fahrenheit = (fahrenheit * 9 / 5) + 32;
		
	}

	public int getFahrenheit() {
		return fahrenheit;
	}
}
