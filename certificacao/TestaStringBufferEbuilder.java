package certificacao;

public class TestaStringBufferEbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder x = new StringBuilder();
		StringBuilder sb = new StringBuilder();

		x.append("inicio");

		System.out.println(x);

		x.append(" fim");

		System.out.println(x);

		x.insert(7, "e ");

		System.out.println(x);
		x.deleteCharAt(2);

		System.out.println(x);

		sb.append(x).delete(0, 2);

		sb.insert(sb.length(), " " + x);

		sb.delete(1, 4);
		
		StringBuilder teste = new StringBuilder("50");
		System.out.println(teste.length()+ "**********");

		System.out.println(sb);

		System.out.println(sb.length());
		
		System.out.println(new StringBuilder("Roberto").reverse());
		
		StringBuilder b5 = new StringBuilder("Roberto Caetano");
		System.out.println(b5+"***********");
		System.out.println(b5.substring(5, 8) + ".");
		System.out.println(b5.subSequence(5, 8) + ".");
		System.out.println(b5);
		

	}

}
