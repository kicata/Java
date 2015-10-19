import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromAText_task8 {
	/*
	 * Write a program to read a text file "Input.txt" holding a sequence of
	 * integer numbers, each at a separate line. Print the sum of the numbers at
	 * the console. Ensure you close correctly the file in case of exception or
	 * in case of normal execution. In case of exception (e.g. the file is
	 * missing), print "Error" as a result. Examples:
	 */

	public static void main(String[] args) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				"Input.txt"));) {
			Long sum = 0L;
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					break;
				} else {
					int number = Integer.parseInt(line);
					sum += number;
				}

			}
			System.out.println(sum);
		} catch (IOException ioex) {
			System.err.println("Error");
		}

	}
}
