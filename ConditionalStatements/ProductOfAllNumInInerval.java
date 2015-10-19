import java.util.Scanner;

public class ProductOfAllNumInInerval {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first num = ");
		int firstNum = input.nextInt();
		System.out.println("Enter second num = ");
		int secondNum = input.nextInt();
		if (secondNum < firstNum) {
			System.out.println("The second num is smaller than the first");
			return;
		} else {
			long product = 1;
			for (int i = firstNum; i <= secondNum; i++) {
				product *= i;
			}
			System.out.printf("The product of nums in interval %d - %d is %d",
					firstNum, secondNum, product);
		}
		input.close();
	}
}
