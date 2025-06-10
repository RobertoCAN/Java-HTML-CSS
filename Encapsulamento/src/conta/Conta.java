package conta;


public class Conta {

	private String titular;
	private double saldo;

	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido.");
		}
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.err.println("Saldo insuficiente para o saque.");
		}
	}

	public void exbirSaldo() {
	System.out.printf("Saldo atual de %s: %.2f\n", titular, saldo );					
	}
}
