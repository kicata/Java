import java.util.ArrayList;
import java.util.Scanner;

public class CombineListOfLetters_task9 {
	/*
	 * Write a program that reads two lists of letters l1 and l2 and combines
	 * them: appends all letters c from l2 to the end of l1, but only when c
	 * does not appear in l1. Print the obtained combined list. All lists are
	 * given as sequence of letters separated by a single space, each at a
	 * separate line. Use ArrayList<Character> of chars to keep the input and
	 * output lists. Examples:
	 */
	/*
	 * h e l l o + l o w -> h e l l o w
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String first = input.nextLine();
		String second = input.nextLine();

		ArrayList<Character> chars = new ArrayList<>();

		for (Character ch : first.toCharArray()) {
			if (!Character.isWhitespace(ch)) {
				chars.add(ch);
			}

		}
		for (Character ch : second.toCharArray()) {
			String chToStr = Character.toString(ch);
			if (!first.contains(chToStr) && !Character.isWhitespace(ch)) {
				chars.add(ch);
			}

		}

		for (Character ch : chars) {
			System.out.print(ch + " ");
		}

	}

}
