import java.util.Scanner;

public class SequencesOfEqualStrings_task2 {
	/*
	 * Write a program that enters an array of strings and finds in it all
	 * sequences of equal elements. The input strings are given as a single
	 * line, separated by a space. Examples:hi yes yes yes bye -> hi yes yes yes
	 * bye
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strArr = input.nextLine().split(" ");

		// Solution with treeMap
		/*
		 * Map<String, Integer> map = new TreeMap<>(); for (String word :
		 * strArr) { Integer count = map.get(word); if (count == null) { count =
		 * 0; } map.put(word, count + 1); } for (String key : map.keySet()) {
		 * int len = map.get(key);
		 * 
		 * for (int i = 0; i < len; i++) { System.out.print(key + " "); }
		 * System.out.println(); }
		 */

		for (int i = 0; i < strArr.length - 1; i++) {
			if (strArr[i].equals(strArr[i + 1])) {
				System.out.print(strArr[i] + " ");
			} else {
				System.out.println(strArr[i]);
			}
			if (i == strArr.length - 2 && strArr[i] != strArr[i + 1]) {
				System.out.println(strArr[i + 1]);
			}
		}

	}
}
