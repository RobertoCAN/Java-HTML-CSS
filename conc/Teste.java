package conc;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Roberto", "Caetano");
		
		System.out.println(p.getNomeCompleto());
		
		Double d = Double.valueOf("505");
		System.out.println("valor de d "+d);
		
		Integer i1 = 123;
		Integer i2 = 123;
		System.out.println(i1 == i2);

	}

}
