import java.util.Scanner;

public class CircleAreaAndPerimeter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter radius of a circle = ");
		double r = input.nextDouble();
		double circArea = Math.PI * r * r;
		double circPerimeter = 2 * Math.PI * r;
		System.out.printf("the Area of circle with radius %.2f is %.3f %n", r,
				circArea);
		System.out.printf(
				"the Perimeter of circle with radius %.2f is %.4f %n", r,
				circPerimeter);
		input.close();
	}
}
