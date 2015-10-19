import java.util.Scanner;

public class sumTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number = ");
		int firstVal = input.nextInt();
		System.out.println("Enter second number = ");
		int secondVal = input.nextInt();

		int sum = firstVal + secondVal;
		System.out.printf("The sum of %d + %d = %d", firstVal, secondVal, sum);

		input.close();

	}

}
