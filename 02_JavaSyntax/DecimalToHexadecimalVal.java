import java.util.Scanner;

public class DecimalToHexadecimalVal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimalVal = input.nextInt();
		String hexadecimalVal = Integer.toHexString(decimalVal);
		System.out.println(hexadecimalVal);

	}

}
