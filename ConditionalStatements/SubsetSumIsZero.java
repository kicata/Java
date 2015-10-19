import java.util.Scanner;

public class SubsetSumIsZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the wanted sum of the subsets:");
		long wantedSum = input.nextLong();
		System.out.println("Enter the number of elements:");
		long numberOfElements = input.nextLong();
		long[] elements = new long[(int) numberOfElements];
		int counter = 0;
		String subset = "";
		for (int i = 0; i < elements.length; i++) {
			System.out.printf("Enter element № %d", i + 1);
			elements[i] = input.nextLong();
		}
		int maxSubsets = (int) Math.pow(2, numberOfElements);
		for (int i = 1; i < maxSubsets; i++) {
			subset = "";
			long checkingSum = 0;
			for (int j = 0; j <= numberOfElements; j++) {
				int mask = 1 << j;
				int nAndMask = i & mask;
				int bit = nAndMask >> j;
				if (bit == 1) {
					checkingSum = checkingSum + elements[j];
					subset = subset + " " + elements[j];
				}
			}
			if (checkingSum == wantedSum) {
				System.out.printf("Number of subest that have the sum of %d%n",
						wantedSum);
				counter++;
				System.out.printf("This subset has a sum of %d : %s %n",
						wantedSum, subset);
			}
		}
		System.out.println(counter);
		input.close();
	}

}
