package listaEstruturaDeDados;

import java.util.ArrayList;

public class ListaSimples {
//	1. ArrayList em Java
//	Defini��o: ArrayList � uma implementa��o da interface List
//	baseada em arrays din�micos que podem crescer conforme necess�rio.
//
//	Caracter�sticas:
//
//	Permite acesso r�pido por �ndice (O(1)).
//	Inser��es e remo��es no final s�o r�pidas (O(1)), mas inser��es e 
//	remo��es em outras posi��es podem ser lentas (O(n)) devido ao deslocamento de elementos.
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
