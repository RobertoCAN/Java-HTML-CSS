package br.com.atividade44;

public class TesteConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
		
		double temperaturaCelsius = 25;
		
		double temperaturaFahrenheint = conversorTemperaturaPadrao.celsiusParaFahrenheit(temperaturaCelsius);
		System.out.println(temperaturaCelsius + " Celcius é igual a " + temperaturaFahrenheint + " Fahrenheit.");
		
		temperaturaFahrenheint = 77;
		temperaturaCelsius = conversorTemperaturaPadrao.fahrenheitParaCelsius(temperaturaFahrenheint);
		System.out.println(temperaturaFahrenheint + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
		
	}

}
