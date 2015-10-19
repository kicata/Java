import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ExtractAllUniqueWords_task10 {
	/*
	 * At the first line at the console you are given a piece of text. Extract
	 * all words from it and print them in alphabetical order. Consider each
	 * non-letter character as word separator. Take the repeating words only
	 * once. Ignore the character casing. Print the result words in a single
	 * line, separated by spaces. Examples: Welcome to SoftUni. Welcome to Java.
	 * java to softuni welcome
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("[^\\w']+");
		SortedMap<String, Integer> mapA = new TreeMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			int count = 1;
			/*
			 * if (mapA.containsKey(key)) { count++; mapA.put(key, count); }
			 */
			mapA.put(key, count);
		}
		for (String key : mapA.keySet()) {
			System.out.print(key + " ");
		}

	}

}
