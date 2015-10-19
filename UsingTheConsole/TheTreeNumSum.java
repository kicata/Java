import java.util.Scanner;

public class TheTreeNumSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter int num = ");
		int a = input.nextInt();
		System.out.println("enter int num = ");
		int b = input.nextInt();
		System.out.println("enter int num = ");
		int c = input.nextInt();

		System.out.printf("The sum of the numbers is %d%n", a + b + c);
		input.close();
	}
}
