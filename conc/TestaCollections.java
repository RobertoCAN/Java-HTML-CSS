package conc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestaCollections {

	public static void main(String[] args) {
		
		
		//elementos são acessíveis por índices
		//são alocaods pela ordem de inserção
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
		
		
		//não aceita elementos repetidos
		//a ordem de inserção não é garantida
		//por consequencia seus elementos não são acessíveis por índixes
		
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
