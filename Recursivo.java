package certificacao;

public class Recursivo {

	public static int teste(int x) {
		if (x <= 1) {
			return 1;
		} else {
			return x + (teste(x - 1) * teste(x - 2));
		}
	}

	public static void main(String[] args) {
		System.out.println(teste(5));
	}

}
