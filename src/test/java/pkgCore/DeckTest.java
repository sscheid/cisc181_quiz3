package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		//	TODO: Build a deck(1), make sure there are 52 cards in the deck
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck 
		Deck d1 = new Deck(1);
		Deck d2 = new Deck(6);
		assertTrue(d1.deckSize()==52);
		assertTrue(d2.deckSize()==312);
		
	}

}
