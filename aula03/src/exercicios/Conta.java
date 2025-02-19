package exercicios;


public class Conta implements Comparable <Conta>{

	private int numero;
	private String titular;

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
		
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	
	
	@Override
	public int compareTo(Conta outraConta) {
		if (this.numero < outraConta.numero) {
			return -1;
		}
		if (this.numero > outraConta.numero) {
			return 1;
		}
		return 0;
	}


}
