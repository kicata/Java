import java.util.Arrays;
import java.util.Scanner;

public class GetLetterIndexFromWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 26;
		char[] letters = new char[n * 2];
		char letterValue = 'A';
		for (int i = 0; i < n; i++) {
			letters[i] = letterValue;
			letterValue++;
		}

		letterValue = 'a';
		for (int i = 26; i < letters.length; i++) {
			letters[i] = letterValue;
			letterValue++;
		}

		System.out.println("Enter a word ");
		String word = scan.nextLine();
		char[] charrArr = word.toCharArray();
		int[] indexes = new int[word.length()];
		for (int i = 0; i < charrArr.length; i++) {
			char curnLetter = charrArr[i];
			/*
			 * for (int j = 0; j < letters.length; j++) { if (curnLetter ==
			 * letters[j]) { indexes[i] = j;
			 * 
			 * }
			 */
			int curnInt = (int) curnLetter - (int) 'A';
			indexes[i] = curnInt;

		}
		System.out.println("The index of letters of word are: ");
		System.out.println(Arrays.toString(indexes));
	}

}
