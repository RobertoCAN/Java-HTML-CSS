package conc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestaCollections {

	public static void main(String[] args) {
		
		
		//elementos s�o acess�veis por �ndices
		//s�o alocaods pela ordem de inser��o
		//aceita elementos repetidos
		
		List<String> nomes = new ArrayList();
		nomes.add("Raphael");
		nomes.add("Paula");
		nomes.add("Mateus");
		nomes.add("Matheus");
		nomes.add("Abelardo");
		
		System.out.println(nomes.get(4));
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		System.out.println(nomes);
		
		
		//n�o aceita elementos repetidos
		//a ordem de inser��o n�o � garantida
		//por consequencia seus elementos n�o s�o acess�veis por �ndixes
		
		Set<String> nomes2 = new HashSet<>();

		nomes2.add("Raphael");
		nomes2.add("Paula");
		nomes2.add("Paula");
		nomes2.add("Mateus");
		nomes2.add("Matheus");
		nomes2.add("Abelardo");
		
		System.out.println(nomes.size());
		System.out.println(nomes2);
		System.out.println(nomes2.contains("paula"));
		
		for (String g : nomes2) {
			
			System.out.print(g + " ");
		}
		
		
		//
		System.out.println("\n TreeSet");
		
		Set<String> nomes3 = new TreeSet<>();

		nomes3.add("Raphael");
		nomes3.add("Paula");
		nomes3.add("Paula");
		nomes3.add("Mateus");
		nomes3.add("Matheus");
		nomes3.add("Abelardo");
		
		System.out.println(nomes.size());
		System.out.println(nomes3);
		System.out.println(nomes3.contains("paula"));
		
		for (String g : nomes3) {
			
			System.out.print(g + " ");
		}
	}

}
