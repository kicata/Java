import java.util.Scanner;

public class PrintAllPrimeNumbersInInterval {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first num = ");
		int n = input.nextInt();
		System.out.println("Enter first num = ");
		int m = input.nextInt();
		for (int num = n; num <= m; num++) {
			boolean isPrime = true;
			int divider = 2;
			int maxDivider = (int) Math.sqrt(num);
			while (divider <= maxDivider) {
				if (num % divider == 0) {
					isPrime = false;
					break;
				}
				divider++;
			}
			if (isPrime) {
				System.out.printf("%d ", num);
			}
		}
		input.close();
	}
}
