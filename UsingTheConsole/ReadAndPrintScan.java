import java.util.Scanner;

public class ReadAndPrintScan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter our first name :");
		String fname = input.nextLine();
		System.out.println("Enter your family name : ");
		String lname = input.nextLine();

		System.out.printf("Your name is -> %s %s %n", fname, lname);
		System.out.println("test");
		input.close();
	}

}
