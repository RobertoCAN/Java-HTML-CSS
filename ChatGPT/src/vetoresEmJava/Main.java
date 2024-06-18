package vetoresEmJava;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		//Verificando o tamanho do ArrayList
		System.out.println("Tamanho do ArrayList: " + list.size()); //Output: 4

		//interando sobre o ArrayList
		System.out.println("Elementos do ArrayList: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();

		//acessando elementos por �ndice
		System.out.println("Elemento de �ndice 2: " + list.get(2));
		
		
		//Modificando um elemento
		list.set(2, 10);//Muda o valor do �ndice 2 para 10
		System.out.println("Elemento no �ndice 2 ap�s modifica��o: " + list.get(2));//Output 10
		
		System.out.println("Elementos do ArrayList ap�s a modifica��o: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		
		//Removendo um elemento por �ndece
		list.remove(2);//Remove i elemento no �dice 2
		System.out.println("Elementos ap�s remo��o: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		//Verificando o tamanho do ArrayList
		System.out.println("Tamanho do ArrayList: " + list.size()); //Output: 4
	}

}
