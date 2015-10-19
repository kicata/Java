import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers_task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		Integer[] arr = new Integer[n];
		String[] strArr = input.nextLine().split(" ");

		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
