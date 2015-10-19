import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstNum = input.nextInt();
		double secondNum = input.nextDouble();
		double thirdNum = input.nextDouble();
		String firstNumHexRepr = Integer.toHexString(firstNum).toUpperCase();
		String firstNumBinaryRepr = String.format("%10s",
				Integer.toBinaryString(firstNum)).replace(' ', '0');

		if (thirdNum % 1 == 0) {
			System.out.printf("|%-10s|%s|%10.2f|%-10.0f|", firstNumHexRepr,
					firstNumBinaryRepr, secondNum, thirdNum);
		} else {
			System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", firstNumHexRepr,
					firstNumBinaryRepr, secondNum, thirdNum);
		}
	}

}
