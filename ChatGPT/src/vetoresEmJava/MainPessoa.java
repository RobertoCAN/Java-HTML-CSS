package vetoresEmJava;

import java.util.ArrayList;

public class MainPessoa {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		// Adicinando objetos ao ArrayList

		pessoas.add(new Pessoa("Alice", 30));
		pessoas.add(new Pessoa("Bob", 25));
		pessoas.add(new Pessoa("Thiago", 12));
		pessoas.add(new Pessoa("Hiago", 35));
		pessoas.add(new Pessoa("Elice", 40));

		// Iterandi sobre o ArrayList e exibindo os objetos

		System.out.println("\nTamanho do ArrayList: "+ pessoas.size());
		
		System.out.println("Lista de passoas:");
		int i = 0; 
		for (Pessoa p : pessoas) {
			System.out.println(++i + " " + p);
			
		}

		// Modificando um objeto
		System.out.println("\nObjeto a ser modificado: " + pessoas.get(1));
		pessoas.get(1).idade = 16;
		System.out.println("Modificado: " + pessoas.get(1));
		
		System.out.println("\nApós modificação:");
		int x = 0;
		for (Pessoa p : pessoas) {
			System.out.println(++x + " " + p);
		}
		
		//removendo
		pessoas.remove(0);
		System.out.println("\nApós a remoção: ");
		int j = 0;
		for (Pessoa p : pessoas) {
			System.out.println(++j + " " + p);
		}
		
		//Verificando o tamanho di Arraylist
		System.out.println("\nTamanho do ArrayList: "+ pessoas.size());
	}

}