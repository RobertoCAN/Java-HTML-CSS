package listaEstruturaDeDados;

import java.util.ArrayList;

public class ListaSimples {
//	1. ArrayList em Java
//	Definição: ArrayList é uma implementação da interface List
//	baseada em arrays dinâmicos que podem crescer conforme necessário.
//
//	Características:
//
//	Permite acesso rápido por índice (O(1)).
//	Inserções e remoções no final são rápidas (O(1)), mas inserções e 
//	remoções em outras posições podem ser lentas (O(n)) devido ao deslocamento de elementos.
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();

		list.add("Elemento 1");
		list.add("Elemento 2");
		list.add("Elemento 3");
		list.add("Elemento 4");
		list.add("Elemento 5");

		System.out.println("Elemnto no indice 1: " + list.get(1));

		list.remove(1);

		for (String elementos : list) {
			System.out.println(elementos);
		}
	}
}
