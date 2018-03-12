package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cards;
	// cards is deck of cards
	
	public Deck(int NumDecks) {
		for (int i = 1; i < NumDecks; i++) {
			for (eSuit eSuit : eSuit.values()) {
				for (eRank eRank : eRank.values()) {
					cards.add(new Card(eRank, eSuit));
				}
			}
		}
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	public int deckSize() {
		return cards.size();
	}
	
	public int getRemaining(Object eNum) {
		int sum = 0;
		if (eNum instanceof eSuit) {
			for (Card c: cards) {
				if (c.geteSuit() == eNum) {
					sum++;
				}
			}
		}
		else if (eNum instanceof eRank) {
			for (Card c: cards) {
				if (c.geteRank() == eNum) {
					sum++;
				}
			}
		}	
		return sum;
	}
}
