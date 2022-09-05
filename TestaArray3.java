package certificacao;

import java.util.ArrayList;
import java.util.Iterator;

class Cliente3{
	String nome;
}
public class TestaArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println("Inserindo valores:");
		System.out.println("Java: " + nomes.add("java") + " C#:" + nomes.add("c#") + " Ruby: " + nomes.add("ruby"));
		
		
		Iterator<String> it = nomes.iterator();
		
		for (String string : nomes) {
			System.out.println(it.next());	
		}
		
		System.out.println(nomes.size());
		
		while(it.hasNext())
		System.out.println(it.next());

		Cliente3 cli3 = new Cliente3();
		cli3.nome = "Roberto";
		
		Cliente3 cli4 = new Cliente3();
		cli4.nome = "Caetano";
		
		ArrayList<Cliente3> arraycli3 = new ArrayList<Cliente3>();
		arraycli3.add(cli3);
		arraycli3.add(cli4);
		
		
		for (Cliente3 cliente3 : arraycli3) {
			System.out.println(cliente3.nome);
		}
		
	}

}
