import java.util.Arrays;
import java.util.Scanner;

public class ReadAndPrintTwoDimentionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] matrix = new int[rows][cols];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("Enter matrix [%d,%d] = %n", row, col);
				matrix[row][col] = scan.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}

}
