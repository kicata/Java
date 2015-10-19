import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.Days;

/*Write a program to calculate the difference between two dates in number of days. 
 The dates are entered at two consecutive lines in format day-month-year. 
 Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100]. */
public class DaysBetweenTwoDates_task_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstDateStr = input.nextLine();
		String secondDateStr = input.nextLine();

		String[] firstDateSplitted = firstDateStr.split("-");
		String[] secondDateSplitted = secondDateStr.split("-");

		DateTime past = new DateTime(Integer.parseInt(firstDateSplitted[2]),
				Integer.parseInt(firstDateSplitted[1]),
				Integer.parseInt(firstDateSplitted[0]), 0, 0);
		DateTime today = new DateTime(Integer.parseInt(secondDateSplitted[2]),
				Integer.parseInt(secondDateSplitted[1]),
				Integer.parseInt(secondDateSplitted[0]), 0, 0);
		int daysBetween = Days.daysBetween(past, today).getDays();
		System.out.println(daysBetween);

	}

}
