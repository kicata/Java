import java.util.Arrays;

public class SortEngine {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 5, 6, 86, 4, 0, -1, -5 };
		int[] sortedArr = sort(arr);
		printArray(sortedArr);

	}

	public static int[] sort(int... numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

	public static void printArray(int... numbers) {
		System.out.println(Arrays.toString(numbers));

	}
}