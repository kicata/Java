import java.util.Scanner;

public class CountSubstringOccurrences_task7 {
	// Write a program to find how many times given string appears in given text
	// as substring.
	// The text is given at the first input line.
	// The search string is given at the second input line. The output is an
	// integer number.
	// Please ignore the character casing. Examples:
	// aaaaaa
	// aa
	// result=5;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		;
		String substr = input.nextLine().toLowerCase();
		int count = 0;
		// Pattern p = Pattern.compile(substr);
		// Matcher m = p.matcher(text);
		// while (m.find()) {
		// count += 1;
		// }
		// System.out.println(count);
		int lastIndex = 0;

		while (lastIndex != -1) {

			lastIndex = text.indexOf(substr, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += substr.length();
				// lastIndex++;
			}
		}
		System.out.println(count);
	}

}
