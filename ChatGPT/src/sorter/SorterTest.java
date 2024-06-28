package sorter;

public class SorterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorter sorter = new Sorter();
		int[] nums = { 5, 6, 7, 8, 1, 2, 3, 4, 12, 13, 22, 23, 24, 15, 17, 18, 19, 20, 21, 11, 9, 10, 14, 16, };
		sorter.selectionSort(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
