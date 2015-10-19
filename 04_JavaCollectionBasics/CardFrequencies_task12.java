import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardFrequencies_task12 {
	/*
	 * We are given a sequence of N playing cards from a standard deck. The
	 * input consists of several cards (face + suit), separated by a space.
	 * Write a program to calculate and print at the console the frequency of
	 * each card face in format "card_face -> frequency". The frequency is
	 * calculated by the formula appearances / N and is expressed in percentages
	 * with exactly 2 digits after the decimal point. The card faces with their
	 * frequency should be printed in the order of the card face's first
	 * appearance in the input. The same card can appear multiple times in the
	 * input, but it's face should be listed only once in the output. Examples:
	 */
	/*
	 * 10♣ 10♥ 10 -> 100.00%
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] allCards = input.nextLine().split(" ");
		Map<String, Integer> faces = new LinkedHashMap<String, Integer>();
		int N = allCards.length;
		for (int i = 0; i < allCards.length; i++) {
			String face = allCards[i].substring(0, allCards[i].length() - 1);
			if (faces.keySet().contains(face)) {
				Integer count = faces.get(face);
				count++;
				faces.put(face, count);
			} else {
				faces.put(face, 1);

			}
		}
		// calculating frequency
		for (String key : faces.keySet()) {
			float occurence = (float) faces.get(key);
			float frequency = (occurence * 100) / N;

			String result = String.format(" -> %.2f", frequency);
			System.out.println(key + result + "%");
		}

	}

}
