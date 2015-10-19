import java.util.Arrays;
import java.util.Scanner;

public class MaxMinOfSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter how many numbers is the length of sequence =");
		int length = input.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter num = ");
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		int min = array[0];
		int max = array[length - 1];
		System.out.println("The sequence that you have entered is:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("min= " + min);
		System.out.println("max= " + max);
		input.close();
	}
}
