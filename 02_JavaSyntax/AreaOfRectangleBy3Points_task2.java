import java.util.Scanner;

public class AreaOfRectangleBy3Points_task2 {

	public static void main(String[] args) {
		Point pointA, pointB, pointC;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Point coordinates here separate by \" \" ");
		int firstPointCoordX = scanner.nextInt();
		int firstPointCoordY = scanner.nextInt();
		int secondPointCoordX = scanner.nextInt();
		int secondPointCoordY = scanner.nextInt();
		int thirdPointCoordX = scanner.nextInt();
		int thirdPointCoordY = scanner.nextInt();

		pointA = new Point(firstPointCoordX, firstPointCoordY);
		pointB = new Point(secondPointCoordX, secondPointCoordY);
		pointC = new Point(thirdPointCoordX, thirdPointCoordY);
		int area = calculateTriangleArea(pointA, pointB, pointC);

		if (area < 0) {
			System.out.println(area * -1);
		} else {
			System.out.println(area);
		}

	}

	public static int calculateTriangleArea(Point pointA, Point pointB,
			Point pointC) {
		int firstPart = pointA.getX() * ((pointB.getY() - pointC.getY()));
		int secondPart = pointB.getX() * ((pointC.getY() - pointA.getY()));
		int thirdPart = pointC.getX() * ((pointA.getY() - pointB.getY()));
		int area = (firstPart + secondPart + thirdPart) / 2;

		return area;
	}

}
