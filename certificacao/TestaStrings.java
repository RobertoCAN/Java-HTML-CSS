package certificacao;

public class TestaStrings {
	 static String vazio;
	public static void main(String[] args) {
		String nome = "Roberto";
		nome = nome.toUpperCase();
		System.out.println(nome);

		
		
		String s2 = new String();
        System.out.println(s2);

		String x = "          Roberto Caetano Assunção Neto               ".toUpperCase().trim();
		System.out.println(x.indexOf("Roberto"));
		System.out.println(x.indexOf("ROBERTO"));
		System.out.println(x.indexOf("E"));
		System.out.println(x.indexOf("CAETANO"));
		System.out.println(x.lastIndexOf("O"));
		System.out.println(x.lastIndexOf("Y"));
		System.out.println(x.lastIndexOf("O", 7));
		System.out.println(x.startsWith("O"));
		System.out.println(x.startsWith("R"));
		System.out.println(x.endsWith("O"));
		System.out.println(x.endsWith("R"));

		
		String s = "Caelum".concat(" - Ensino e Inovação");
	    System.out.println(s.concat("* - Ensino e Inovação*"));
	    System.out.println(s);
	    
	  
	    System.out.println(nome +" não "+ vazio);

	    String sw=null;
        String s2x = new String(sw);
        System.out.println(s2x);

		
//		System.out.println(x);
//		System.out.println(x.substring(3));
//		System.out.println(x.substring(3,19));
//		
//		
//		System.out.println(nome.charAt(2));
//		
//		System.out.println(nome.length());
//		
//		String nome2 = new String("roberto2");
//		
//		System.out.println(nome2.replace('o', 'i'));
//		
//		System.out.println(nome.replace("ROB", "ren"));
//		
//		char[] nome3 = new char[] {'R','o','b','e','r','t','o'};
//		String nome4 = new String(nome3);
//		System.out.println(nome4);
//
//		
//		StringBuilder j = new StringBuilder();
//		j.append("Java");
//		System.out.println(nome4 +" "+ j);
	    
	    String sx = "Caelum";
	    sx.concat(" - Ensino e Inovação");
	    System.out.println(sx);

	    StringBuffer sv = new StringBuffer("Caelum");
	    sv.append(" - Ensino e Inovação");
	    System.out.println(s);

	}

}
