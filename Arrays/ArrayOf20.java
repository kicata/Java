import java.util.Scanner;

public class ArrayOf20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array dimentions n= ");
		int n = input.nextInt();
		int[] array = new int[n];
		int count = 0;
		while (count < n) {
			System.out.printf("Enter numer %d = ", count);
			array[count] = input.nextInt();
			count++;
		}
		// for (int i = 0; i < array.length; i++) {
		// System.out.printf("Enter numer %d = ",i);
		// array[i]=input.nextInt();
		// }
		System.out.println("You have entered this array:");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}

	}

}
