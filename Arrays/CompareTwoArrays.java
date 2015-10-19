import java.util.Scanner;

public class CompareTwoArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter array1 dimentions n= ");
		int n = input.nextInt();
		int[] array1 = new int[n];
		for (int i = 0; i < array1.length; i++) {
			System.out.printf("Enter array1 memeber %d = ", i);
			input.nextInt();
		}

		System.out.println("Enter array2 dimentions m= ");
		int m = input.nextInt();
		int[] array2 = new int[m];
		for (int i = 0; i < array2.length; i++) {
			System.out.printf("Enter array2 memeber %d = ", i);
			input.nextInt();
		}

		if (m != n) {
			System.out.println("The two array are not with same dimentions");

		} else {
			boolean areEqual = true;
			for (int i = 0; i < array2.length; i++) {
				if (array1[i] != array2[i]) {
					areEqual = false;
				}

			}
			if (areEqual) {
				System.out.println("The two arrays are equal");
			} else {
				System.out.println("The two arrays are not equal");
			}

		}

	}

}
