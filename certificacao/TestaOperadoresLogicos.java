package certificacao;

public class TestaOperadoresLogicos {

	public static boolean opera() {
		System.out.println("Imprime");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1 != 1 && opera());
		System.out.println(1 <= 2 || opera());
	}

}
