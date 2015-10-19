import java.util.Scanner;

public class SmallestOf3Nums_task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double smallest = input.nextDouble();
		double secondVal = input.nextDouble();
		if (secondVal < smallest) {
			smallest = secondVal;
		}
		double thirdVal = input.nextDouble();
		if (thirdVal < smallest) {
			smallest = thirdVal;
		}
		System.out.println(smallest);
	}

}
