import java.util.Scanner;

public class RectangleArea_01Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter rectangle sides separated by \" \"");
		int firstSide = scanner.nextInt();
		int secondSide = scanner.nextInt();

		System.out.print("The area of rectangle is ");
		System.out.println(calculateArea(firstSide, secondSide));

	}

	public static int calculateArea(int firstSide, int secondSide) {
		int area = firstSide * secondSide;
		return area;
	}

}
