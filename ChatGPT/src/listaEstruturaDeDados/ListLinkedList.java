package listaEstruturaDeDados;

import java.util.LinkedList;


//Defini��o: LinkedList � uma implementa��o da interface List baseada em uma lista duplamente encadeada.
//
//Caracter�sticas:
//
//Inser��es e remo��es no in�cio e no final s�o r�pidas (O(1)).
//Acesso por �ndice � lento (O(n)).
//3. Compara��o entre ArrayList e LinkedList
//ArrayList:
//
//Melhor para acesso aleat�rio r�pido.
//Melhor para casos onde as inser��es e remo��es s�o feitas principalmente no final da lista.
//LinkedList:
//
//Melhor para inser��es e remo��es frequentes no in�cio ou no meio da lista.
//Menos eficiente para acesso aleat�rio.

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
		list.addLast("�ltimo Elemento");
		
		for (String elementos : list) {
			System.out.println(elementos);
		}

		System.out.println("Primeiro elemento: " + list.getFirst());
		System.out.println("�ltimo elemento: " + list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		for (String elementos : list) {
			System.out.println(elementos);
		}

	}

}
