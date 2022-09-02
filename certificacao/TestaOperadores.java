package certificacao;

public class TestaOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 200;
		System.out.println(v / 0.0);
		
		double positivoInfinito = 100 / 0.0;
		double negativoInfinito = -100 / 0.0;
		
		System.out.println(positivoInfinito + negativoInfinito);
	}

}
