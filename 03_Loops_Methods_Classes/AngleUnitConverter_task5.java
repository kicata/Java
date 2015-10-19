import java.util.Scanner;

public class AngleUnitConverter_task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = input.nextInt();
		input.nextLine();
		for (int i = 0; i < n; i++) {
			String[] strArr = input.nextLine().split("\\s+");

			String conversionType = strArr[1];
			Double valueToConvert = Double.parseDouble(strArr[0]);
			double result;
			String strResult = "";

			if (conversionType.contentEquals("rad")) {
				result = radToDegreeConverter(valueToConvert);
				strResult = String.format("%6f deg%n", result);
				sb.append(strResult);

			} else if (conversionType.contentEquals("deg")) {
				result = degToRadianConverter(valueToConvert);
				strResult = String.format("%6f rad%n", result);
				sb.append(strResult);

			} else {
				System.out.println("Invalid InputStr");
			}
		}
		System.out.println(sb.toString());
	}

	public static double degToRadianConverter(double degrValue) {
		final double OPERAND = Math.PI / 180;
		double radians = degrValue * OPERAND;
		return radians;
	}

	public static double radToDegreeConverter(double radValue) {
		final double OPERAND = 180 / Math.PI;
		double degrees = radValue * OPERAND;
		return degrees;
	}
}
