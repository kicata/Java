import java.util.Arrays;
import java.util.Scanner;

public class sortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many strings you want to sort ");
		int n = input.nextInt();
		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Enter a string %d = %n", i);
			array[i] = input.next();
		}

		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
