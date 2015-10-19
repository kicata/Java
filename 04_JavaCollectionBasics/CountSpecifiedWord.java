import java.util.Scanner;

public class CountSpecifiedWord {
	// Write a program to find how many times a word appears in given text. The
	// text is given at the first input line.
	// The target word is given at the second input line. The output is an
	// integer number.
	// Please ignore the character casing. Consider that any non-letter
	// character is a word separator.
	// Examples:
	// Welcome to the Software University (SoftUni)! Welcome to programming.
	// welcome
	// result = 2

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String specWord = input.nextLine();
		int count = 0;
		String[] strArr = text.split("[^\\w]+");
		for (int i = 0; i < strArr.length; i++) {
			String curnWord = strArr[i];
			if (curnWord.equalsIgnoreCase(specWord)) {
				count++;
			}
		}

		System.out.println(count);

	}

}
