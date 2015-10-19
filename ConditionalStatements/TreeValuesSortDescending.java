import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TreeValuesSortDescending {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] arr = new Integer[3];

		System.out.println("Enter int number = ");
		arr[0] = input.nextInt();
		System.out.println("Enter int number = ");
		arr[1] = input.nextInt();
		System.out.println("Enter int number = ");
		arr[2] = input.nextInt();
		Arrays.sort(arr);
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		input.close();
	}

}
