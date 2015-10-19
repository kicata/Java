import java.util.Scanner;

/*
 * Write a program to find all increasing sequences inside an array of
 * integers. The integers are given in a single line, separated by a space.
 * Print the sequences in the order of their appearance in the input array,
 * each at a single line. Separate the sequence elements by a space. Find
 * also the longest increasing sequence and print it at the last line. If
 * several sequences have the same longest length, print the leftmost of
 * them. Examples:
 */
public class LongestIncreasingSequence_task4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] strVals = input.nextLine().split(" ");
		Integer[] arr = new Integer[strVals.length];

		for (int i = 0; i < strVals.length; i++) {
			arr[i] = Integer.parseInt(strVals[i]);
		}

		int maxSeq = 1;
		int curnSeq = 1;
		int curnSeqFirstIndex = 0;
		int maxSeqFirstIndex = 0;
		System.out.print(arr[0]);
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i - 1] <= arr[i]) {
				System.out.print(" " + arr[i]);
				curnSeq++;

			} else {
				System.out.println(arr[i]);
				if (curnSeq > maxSeq) {
					maxSeq = curnSeq;
					maxSeqFirstIndex = curnSeqFirstIndex;
				}
				curnSeqFirstIndex = i + 1;
				curnSeq = 1;
			}
		}
		if (maxSeq == 1) {
			System.out.printf("Longest: %d", arr[maxSeqFirstIndex]);

		} else {
			System.out.println();
			System.out.print("Longest: ");
			int len = maxSeq + maxSeqFirstIndex;
			for (int i = maxSeqFirstIndex; i < len; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
