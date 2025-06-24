package testePessoa;

import java.util.ArrayList;

public class TestePessoa {

	public static void main(String[] args) {
		String atributosNome []= {"Akemil","Rodrigo", "Caroline"}; 
		int atributosIdade []= {18,30,35};
		
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		
		for (int i = 0; i < atributosIdade.length; i++) {
			Pessoa pessoa = new Pessoa(atributosNome[i], atributosIdade[i]);
			listaDePessoas.add(pessoa);
		}
		
		System.out.println("Tamanho da lista: " + listaDePessoas.size());
		
		System.out.println("Lista de Pessoas:");
		for (Pessoa pessoa : listaDePessoas) {
		    System.out.println(pessoa);
		}
		
		
		
	}

}
