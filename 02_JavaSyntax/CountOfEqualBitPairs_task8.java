import java.util.Scanner;

public class CountOfEqualBitPairs_task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int bitCounts = Integer.bitCount(number);
		System.out.println(bitCounts);
		/*
		 * char[] arr = Integer.toBinaryString(number).toCharArray(); int
		 * counterBitPairs = 0; for (int i = 0; i < arr.length - 1; i++) { if
		 * (arr[i] == arr[i + 1]) { counterBitPairs++; } }
		 * System.out.println(counterBitPairs);
		 */
	}
}
