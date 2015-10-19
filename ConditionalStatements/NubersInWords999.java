import java.util.Scanner;

public class NubersInWords999 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number in range [0-999]:");
		int number = input.nextInt();
		int hundrets = number / 100;
		int tens = (number - (hundrets * 100)) / 10;
		int ones = (number - (hundrets * 100) - (tens * 10));
		int specials = number % 100;
		String[] array = { "нула", "едно", "две", "три", "четири", "пет",
				"шест", "седем", "осем", "девет", "десет", "единадесет",
				"дванадесет", "тринадесет", "четиринадесет", "петнадесет",
				"шестнадесет", "седемнадесет", "осемнадесет", "деветнадесет" };
		String[] array2 = { "двадесет", "тридесет", "четирдесет", "петдесет",
				"шестдесет", "седемдесет", "осемдесет", "деветдесет" };
		String[] array3 = { "сто", "двеста", "триста", "четиристотин",
				"петстотин", "шестстотин", "седемстотин", "осемстотин",
				"деветстотин" };
		if (number >= 0 && number < 20) {
			System.out.printf("%s", array[number]);
		} else if (number >= 20 && number <= 99) {
			if (number % 10 == 0) {
				System.out.printf("%s", array2[tens - 2]);
			} else {
				System.out.printf("%s %s", array2[tens - 2], array[ones]);
			}
		} else if (number > 99 && number < 1000) {
			if (specials == 0) {
				System.out.printf("%s", array3[hundrets - 1]);
			} else if (specials > 0 && specials < 20) {
				System.out.printf("%s и %s", array3[hundrets - 1],
						array[specials]);
			} else if (number % 10 == 0) {

				System.out.printf("%s и %s", array3[hundrets - 1],
						array2[tens - 2]);
			} else {
				System.out.printf("%s %s и %s", array3[hundrets - 1],
						array2[tens - 2], array[ones]);

			}
		}
		input.close();

	}

}
