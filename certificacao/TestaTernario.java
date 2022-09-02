package certificacao;

public class TestaTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor = 5;
		boolean resultado = valor == 5 ? true : false;

		System.out.println(resultado);

		Object x = valor == 5 ? "igual a cinco" : 0d;

		System.out.println(valor == 5 ? "igual a cinco" : 0);//Funciona no println pois tudo aqui é objeto.

		String nome = "String";
		int tamanho = nome.length();
		System.out.println(tamanho);
	}

}
