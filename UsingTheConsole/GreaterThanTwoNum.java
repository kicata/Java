import java.util.Scanner;

public class GreaterThanTwoNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter int num = ");
		int a = input.nextInt();
		System.out.println("enter int num = ");
		int b = input.nextInt();
		if (a == b) {
			throw new ArithmeticException("The two num are equal");
		}
		int max = Math.max(a, b);
		System.out.printf("The greater num is -> %d", max);
		input.close();
	}
}
