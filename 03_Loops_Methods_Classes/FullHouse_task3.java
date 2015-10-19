public class FullHouse_task3 {
	/*
	 * In most Poker games, the "full house" hand is defined as three cards of
	 * the same face + two cards of the same face, other than the first,
	 * regardless of the card's suits. The cards faces are "2", "3", "4", "5",
	 * "6", "7", "8", "9", "10", "J", "Q", "K" and "A". The card suits are "♣",
	 * "♦", "♥" and "♠". Write a program to generate and print all full houses
	 * and print their number.
	 */

	public static void main(String[] args) {
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suits = { "♣", "♦", "♥", "♠" };
		int fullHouseCount = 0;
		int facesLength = faces.length;
		int suitsLength = suits.length;

		for (int treeOfAKind = 0; treeOfAKind < facesLength; treeOfAKind++) {

			for (int twoOfAKind = 0; twoOfAKind < facesLength; twoOfAKind++) {

				if (treeOfAKind != twoOfAKind) {
					for (int i = 0; i < suitsLength; i++) {
						for (int j = i + 1; j < suitsLength; j++) {
							for (int k = j + 1; k < suitsLength; k++) {
								for (int m = 0; m < suitsLength; m++) {
									for (int l = m + 1; l < suitsLength; l++) {
										System.out.printf(
												"%s%s %s%s %s%s %s%s %s%s %n",
												faces[treeOfAKind], suits[i],
												faces[treeOfAKind], suits[j],
												faces[treeOfAKind], suits[k],
												faces[twoOfAKind], suits[m],
												faces[twoOfAKind], suits[l]);
										fullHouseCount++;
									}
								}
							}
						}
					}

				}

			}
		}
		System.out.println(fullHouseCount);

	}

}
