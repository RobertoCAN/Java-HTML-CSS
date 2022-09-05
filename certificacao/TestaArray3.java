package certificacao;

import java.util.ArrayList;
import java.util.Iterator;

public class TestaArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println("Inserindo valores:");
		System.out.println("Java: " + nomes.add("java") + " C#:" + nomes.add("c#") + " Ruby: " + nomes.add("ruby"));
		
		
		Iterator<String> it = nomes.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}

}
