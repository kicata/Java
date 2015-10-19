import java.util.Scanner;

public class FactorialNExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive int number = ");
		int num = input.nextInt();
		long factorial = 1;
		do {
			factorial *= num;
			System.out.println(num + "!= ");
			System.out.println(factorial);
			num--;

		} while (num > 0);

	}
}
