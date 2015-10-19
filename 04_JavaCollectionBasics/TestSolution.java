import java.util.Scanner;

public class TestSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] elements1 = input.nextLine().split(" ");
		int[] elements = new int[elements1.length];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = Integer.parseInt(elements1[i]);
		}
		input.close();
		String resultString = String.valueOf(elements[0]);
		String innerString = resultString;
		int result = 0;
		int counterInner = 1;
		System.out.print(elements[0]);
		for (int i = 1; i < elements.length; i++) {

			if (elements[i] > elements[i - 1]) {
				System.out.print(" " + elements[i]);
				innerString += " " + elements[i];
				counterInner++;
				if (counterInner > result) {
					result = counterInner;
					resultString = innerString;
				}
			} else {
				if (counterInner > result) {
					result = counterInner;
					resultString = innerString;
				}
				innerString = "" + String.valueOf(elements[i]);
				counterInner = 1;
				System.out.println();
				System.out.print(elements[i]);
			}

		}
		System.out.println();
		System.out.println("Longest: " + resultString);

	}

}
