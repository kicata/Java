import java.util.Scanner;

public class CountOfBit1_task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		char[] arr = Integer.toBinaryString(number).toCharArray();
		int counterOneDigit = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				counterOneDigit++;
			}
		}
		System.out.println(counterOneDigit);
	}

}
