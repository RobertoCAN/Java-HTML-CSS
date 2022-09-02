package certificacao;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println("Inserindo valores:");
		System.out.println("Java: " + nomes.add("java") + " C#:" + nomes.add("c#") + " Ruby: " + nomes.add("ruby"));
		
		System.out.println("Posição do array");
		System.out.println("Java: " + nomes.indexOf("java") + " - C#: " + nomes.indexOf("c#") + " - Ruby: " + nomes.indexOf("ruby"));

		for (int i = 0; i < nomes.size(); i++) {
			System.out.print(nomes.get(i) + " - ");
		}
		System.out.println("Tamanho da lista: " + nomes.size());

		nomes.add("java");
		
		System.out.println("Posição do array");
		System.out.println("Java: " + nomes.indexOf("java") + " - C#: " + nomes.indexOf("c#") + " - Ruby: " + nomes.indexOf("ruby"));
		
		for (String string : nomes) {
			System.out.print(string +" ");
		}
		System.out.println();
		for (int i = 0; i < nomes.size(); i++) {
			System.out.print(nomes.get(i) + " - ");
		}

		System.out.println("Tamanho da lista: " + nomes.size());

		System.out.println("Verificando valores:");
		System.out.println(nomes.contains("java") + " " + nomes.contains("c#") + " " + nomes.contains("ruby"));

		nomes.remove("java");

		System.out.println("Tamanho da lista: " + nomes.size());

		if (nomes.contains("java"))
			System.out.println("Inserido Java!");
		else
			System.out.println("Deletadojava");
		if (nomes.contains("c#"))
			System.out.println("Inserido C#!");
		else
			System.out.println("Deletado C#");
		if (nomes.contains("ruby"))
			System.out.println("Inserido Runy!");
		else
			System.out.println("Deletado Ruby");

		String nomesArry[] = nomes.toArray(new String[nomes.size()]);

		System.out.println("Promeiro valor: " + nomesArry[0] + ", Segundo valor: " + nomesArry[1] + ", Terceiro valor: "
				+ nomesArry[2]);
	}

}
