//Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.

package com.liambass.conditionalsexercises;

public class BlackJack {

	public static void main(String[] args) {
		int hand1 = 20;
		int hand2 = 20;
		int winninghand = blackjack(hand1, hand2);

	}

	private static int blackjack(int hand1, int hand2) {
		if (hand1 <= 21 && hand1 > hand2) {
			System.out.println("Player 1 wins with a hand of " + hand1);
			return hand1;
		} else if (hand2 <= 21 && hand1 < hand2) {
			System.out.println("Player 1 wins with a hand of " + hand1);
			return hand2;
		} else if (hand2 <= 21 && hand1 == hand2) {
			System.out.println("The players draw with a hand of " + hand1);
			return hand2;
		} else {
			System.out.println("Both players are bust!");
			return 0;
		}

	}

}
