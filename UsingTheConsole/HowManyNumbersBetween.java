import java.util.Scanner;

public class HowManyNumbersBetween {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter first int num = ");
		int first = input.nextInt();
		System.out.println("enter second int num = ");
		int second = input.nextInt();
		int count = 0;

		for (int i = first; i < second; i++) {

			if (i % 5 == 0) {
				count++;
				System.out.printf("%d - %d %n", count, i);
			}
		}

		if (count == 0) {
			System.out.println("There isn't an appropriate number to show");
		}
		input.close();
	}

}
