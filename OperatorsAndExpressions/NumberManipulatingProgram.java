import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberManipulatingProgram {

	public static void main(String[] args) {

		int number = Integer.parseInt(getInput("Enter number "));
		int sum = sumDigitsOfNumber(number);
		String reverse = reverseDigitsOfNumber(number);
		System.out.println("The sum of digits is -> " + sum);
		System.out.println("The reversed nuber is -> " + reverse);
	}

	public static String getInput(String messageToUser) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(messageToUser);
		System.out.flush();
		try {
			return bf.readLine();
		} catch (Exception e) {
			return "Error : " + e.getMessage();
		}
	}

	public static String reverseDigitsOfNumber(int number) {

		String str = Integer.toString(number);
		char[] array = str.toCharArray();
		String reverse = "";

		for (int i = array.length - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		return reverse;
	}

	public static int sumDigitsOfNumber(int number) {

		String str = Integer.toString(number);
		char[] array = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			int digit = Character.getNumericValue(array[i]);
			sum += digit;
		}

		return sum;
	}

	// public static String revereseLastDigit(int number)
	// {
	// String str = Integer.toString(number);
	// char[] array = str.toCharArray();
	// char swap=array[0];
	//
	// }
}
