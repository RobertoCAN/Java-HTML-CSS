package br.com.atividade42;

public class CaluladoraSalaRetangular implements CalculoGeometrico{
	
	@Override
	public void calcularArea(double altura, double largura) {
		// TODO Auto-generated method stub
		double area = altura * largura;
		System.out.println("A �rea da sala retangular �: " + area);
	}
	
	@Override
	public void cacularPerimetro(double altura, double largura) {
		// TODO Auto-generated method stub
		double perimetro = 2 *(altura + largura);
		System.out.println("O perimetro da sala retangular �: " + perimetro);		
	}
	
}