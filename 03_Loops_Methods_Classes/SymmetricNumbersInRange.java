import java.util.Scanner;

public class SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();

		for (int i = start; i <= end; i++) {
			String numToStr = Integer.toString(i);
			if (numToStr.charAt(0) == numToStr.charAt(numToStr.length() - 1)) {
				System.out.print(numToStr + " ");
			}
		}

	}

}
