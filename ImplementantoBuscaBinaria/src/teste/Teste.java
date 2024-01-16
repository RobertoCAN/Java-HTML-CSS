package teste;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuscaBinaria ob = new BuscaBinaria();

		int arr[] = { 1, 4, 5, 8, 9, 10, 11, 12, 14, 16, 18, 19, 21, 24, 25 };
		int n = arr.length;
		int x = 10;
		int result = ob.buscaBinaria(arr, 0, n - 1, x);

		if (result == -1)
			System.out.println("Elemento não esta presente");
		else
			System.out.println("Element encontrado " + result);
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