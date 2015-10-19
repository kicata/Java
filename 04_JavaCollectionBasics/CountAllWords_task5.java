import java.util.Scanner;

public class CountAllWords_task5 {
	// Write a program to count the number of words in given sentence. Use any
	// non-letter character as word separator.
	// Examples:
	// Java is a set of several computer software products and specifications
	// from Oracle
	// Corporation that provides a system for developing application software
	// and deploying
	// it in a cross-platform computing environment. Java is used in a wide
	// variety of computing
	// platforms from embedded devices and mobile phones on the low end, to
	// enterprise servers and
	// supercomputers on the high end.
	// result 60
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] words = text.split("[^\\w']+");
		int wordCount = words.length;
		System.out.println(wordCount);

	}

}
