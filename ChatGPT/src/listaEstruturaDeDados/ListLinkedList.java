package listaEstruturaDeDados;

import java.util.LinkedList;

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
