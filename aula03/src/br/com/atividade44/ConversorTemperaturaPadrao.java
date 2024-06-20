package br.com.atividade44;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
	@Override
	public double celsiusParaFahrenheit(double temperaturaCelsius) {
		// TODO Auto-generated method stub
		return (temperaturaCelsius * 9 / 5) + 32;
	}

	@Override
	public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
		// TODO Auto-generated method stub
		return (temperaturaFahrenheit - 32) *5 / 9;
	}
}
