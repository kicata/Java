import java.util.Scanner;

public class PointsInsideTheFigure_task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double xCoord = input.nextDouble();
		double yCoord = input.nextDouble();
		Point curnPoint = new Point(xCoord, yCoord);
		Boolean isInBigFigure = isPointInsideBigFigure(curnPoint);
		Boolean isInSmallFigure = isPointInsideSmallFigure(curnPoint);

		if (isInBigFigure && !isInSmallFigure) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}

	}

	public static boolean isPointInsideSmallFigure(Point currentPoint) {
		Point smallTopLeft = new Point(17.5, 8.5);
		Point smallTopRigh = new Point(20, 8.5);
		Point smallBottomLeft = new Point(17.5, 13.5);
		Point smallBottomRight = new Point(20, 13.5);
		Boolean isInsideSmallFigure = false;

		if ((currentPoint.getX() > smallTopLeft.getX() && currentPoint.getX() < smallTopRigh
				.getX())
				&& (currentPoint.getY() > smallTopLeft.getY() && currentPoint
						.getY() <= smallBottomLeft.getY())) {
			isInsideSmallFigure = true;
		}
		return isInsideSmallFigure;
	}

	public static boolean isPointInsideBigFigure(Point currentPoint) {
		Point topLeft = new Point(12.5, 6);
		Point topRight = new Point(22.5, 6);
		Point bottomLeft = new Point(12.5, 13.5);
		Point bottomRight = new Point(22.5, 13.5);
		Boolean isInsideBigFigure = false;

		if ((currentPoint.getX() >= topLeft.getX() && currentPoint.getX() <= topRight
				.getX())
				&& (currentPoint.getY() >= topLeft.getY() && currentPoint
						.getY() <= bottomLeft.getY())) {
			isInsideBigFigure = true;
		}

		return isInsideBigFigure;
	}

}
