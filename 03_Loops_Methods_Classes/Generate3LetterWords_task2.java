import java.util.Scanner;

public class Generate3LetterWords_task2 {
	/*
	 * Write a program to generate and print all 3-letter words consisting of
	 * given set of characters. For example if we have the characters 'a' and
	 * 'b', all possible words will be "aaa", "aab", "aba", "abb", "baa", "bab",
	 * "bba" and "bbb". The input characters are given as string at the first
	 * line of the input. Input characters are unique (there are no repeating
	 * characters). Examples:
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		char[] arr = inputStr.toCharArray();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					String curnCombination = String.valueOf(arr[i])
							+ String.valueOf(arr[j]) + String.valueOf(arr[k]);
					result.append(curnCombination + " ");

				}
			}
		}
		System.out.println(result.toString());
	}

}
