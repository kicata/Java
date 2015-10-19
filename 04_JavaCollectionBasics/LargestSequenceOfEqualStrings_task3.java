import java.util.Scanner;

public class LargestSequenceOfEqualStrings_task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strArr = input.nextLine().split(" ");
		int maxLength = 1;
		int curnLength = 1;
		String curnWord = "";
		for (int i = 0; i < strArr.length - 1; i++) {
			if (strArr[i].equals(strArr[i + 1])) {
				curnLength++;

				if (curnLength > maxLength) {
					maxLength = curnLength;
					curnWord = strArr[i];
				}
			} else {
				curnLength = 1;
			}
		}
		if (maxLength == 1) {
			System.out.println(strArr[0]);
		} else {
			for (int i = 0; i < maxLength; i++) {
				System.out.print(curnWord + " ");
			}
		}
	}

}
