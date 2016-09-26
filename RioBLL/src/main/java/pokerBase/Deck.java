package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck  
{
	private ArrayList<Card> curDeck = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				curDeck.add(new Card(eSuit, eRank, iCardNbr++));
			}
		}
		Collections.shuffle(curDeck);
	}
	public Card draw()
	{
		Card c = curDeck.get(1);
		curDeck.remove(1);
		return c;
	}
	public int left()
	{
		return curDeck.size();
	}
}

