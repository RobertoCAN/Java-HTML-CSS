package sorter;

public class Sorter {
	public void selectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int leastPosition = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[leastPosition])
					leastPosition = j;
			}
			int temp = numbers[leastPosition];
			numbers[leastPosition] = numbers[i];
			numbers[i] = temp;
		}
	}
}
