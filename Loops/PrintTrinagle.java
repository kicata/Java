import java.util.Scanner;

public class PrintTrinagle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many row you want ");
		int n = scanner.nextInt();

		for (int row = 1; row <= n; row++) {
			System.out.println();
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}

		}
		int q = n;
		for (int r = 1; r <= n - 1; r++) {
			System.out.println();
			q--;
			for (int c = 1; c <= q; c++) {
				System.out.print(c + " ");
			}

		}

	}

}
