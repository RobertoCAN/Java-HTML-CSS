package listaEstruturaDeDados;

import java.util.LinkedList;


//Definição: LinkedList é uma implementação da interface List baseada em uma lista duplamente encadeada.
//
//Características:
//
//Inserções e remoções no início e no final são rápidas (O(1)).
//Acesso por índice é lento (O(n)).
//3. Comparação entre ArrayList e LinkedList
//ArrayList:
//
//Melhor para acesso aleatório rápido.
//Melhor para casos onde as inserções e remoções são feitas principalmente no final da lista.
//LinkedList:
//
//Melhor para inserções e remoções frequentes no início ou no meio da lista.
//Menos eficiente para acesso aleatório.

public class ListLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Elemento 1");
		list.add("Elemento 2");
		list.add("Elemento 3");
		list.add("Elemento 4");
		list.add("Elemento 5");

		for (String elementos : list) {
			System.out.println(elementos);
		}
		
		list.addFirst("Primeiro elemento");
		list.addLast("Último Elemento");
		
		for (String elementos : list) {
			System.out.println(elementos);
		}

		System.out.println("Primeiro elemento: " + list.getFirst());
		System.out.println("Último elemento: " + list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		for (String elementos : list) {
			System.out.println(elementos);
		}

	}

}
