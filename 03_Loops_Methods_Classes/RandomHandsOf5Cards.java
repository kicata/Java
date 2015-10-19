import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {
	// Write a program to generate n random hands of 5 different cards form a
	// standard suit of 52 cards.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suits = { "♣", "♦", "♥", "♠" };

		int numOfHands = input.nextInt();
		for (int i = 0; i < numOfHands; i++) {
			System.out.println(generateHand(faces, suits));
		}

	}

	public static Boolean isCardAlreadyExist(String card,
			ArrayList<String> cards) {
		Boolean isCardExist = false;

		if (cards.contains(card)) {
			isCardExist = true;
		}

		return isCardExist;
	}

	public static String generateHand(String[] faces, String[] suits) {
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder();
		ArrayList<String> cards = new ArrayList<>();
		int counter = 0;

		while (counter < 5) {
			int randomFacesNum = rnd.nextInt(13);
			int randomSuitsNum = rnd.nextInt(4);
			String card = faces[randomFacesNum] + suits[randomSuitsNum];

			if (isCardAlreadyExist(card, cards)) {
				continue;
			} else {
				cards.add(card);
				// cards[counter] = card;
				counter++;
			}

		}

		for (String card : cards) {
			sb.append(card + " ");
		}
		return sb.toString();
	}

}
