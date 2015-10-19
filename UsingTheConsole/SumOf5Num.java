import java.math.BigDecimal;
import java.util.Scanner;

public class SumOf5Num {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int count = 0;
		BigDecimal sum = BigDecimal.ZERO;

		do {
			System.out.println("enter int num = ");
			BigDecimal number = input.nextBigDecimal();
			sum = sum.add(number);
			count++;
		} while (count < 5);

		System.out.print("the sum of 5 numbers is ");
		System.out.println(sum);
		input.close();
	}

}
