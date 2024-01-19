package teste;

import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuscaBinaria ob = new BuscaBinaria();

//		Random random = new Random();
//		int arr[] = new int[25];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = random.nextInt(25) + 1;
//			System.out.print(arr[i] + " - ");
//		}

		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		
		int n = arr.length;
		
		Random random = new Random();
		int x = random.nextInt(100) + 1;
		System.out.println("Numero para ser encotrado: "+x);
		
		int result = ob.buscaBinaria(arr, 0, n - 1, x);

		if (result == -1)
			System.out.println("\n" + "Elemento não esta presente");
		else
			System.out.println("\n" + "Elemento encontrado " + result);
	}
}

class BuscaBinaria {
	// TODO Auto-generated method stub

	public int buscaBinaria(int[] arr, int l, int r, int x) {

		while (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] == x) {
				return mid;

			} else if (arr[mid] > x) {
				r = mid - 1;

			} else {
				l = mid + 1;
			}
		}

		return -1;
	}

}