package conc;

public class CarroTesta {

	public static void main(String[] args) {
		Carro a =  new Carro();
		
		a.modelo="Fordk";
		a.setmodelo("Fordk");
		
		a.imprimeDados();
		System.out.println(a.getDadosDeImpressao());
		System.out.println(a.ano);
		System.out.println(a.modelo.length());
	}

}
