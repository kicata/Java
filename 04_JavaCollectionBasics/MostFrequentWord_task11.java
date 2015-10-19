import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWord_task11 {
	/*
	 * Write a program to find the most frequent word in a text and print it, as
	 * well as how many times it appears in format "word -> count". Consider any
	 * non-letter character as a word separator. Ignore the character casing. If
	 * several words have the same maximal frequency, print all of them in
	 * alphabetical order. Examples:
	 */
	/*
	 * in the middle of the night the -> 2 times
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("[^\\w']+");
		Map<String, Integer> wordsContainer = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (wordsContainer.keySet().contains(key)) {
				Integer count = wordsContainer.get(key) + 1;
				wordsContainer.put(key, count);
			} else {
				wordsContainer.put(key, 1);
			}
		}
		int maxValueInMap = Collections.max(wordsContainer.values());
		for (String key : wordsContainer.keySet()) {
			if (wordsContainer.get(key) == maxValueInMap) {
				System.out.println(key + " -> " + wordsContainer.get(key)
						+ " times");
			}
		}
	}
}
