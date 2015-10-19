import java.util.Scanner;

public class GreaterFrom5Num {

	public static void main(String[] args) {
		int count = 0;
		long max = Long.MIN_VALUE;
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("enter int num = ");
			long number = input.nextLong();

			if (number > max) {
				max = number;
			}
			count++;
		} while (count < 5);
		System.out.printf("the greater from 5 numbers is %d", max);
		input.close();
	}

}
