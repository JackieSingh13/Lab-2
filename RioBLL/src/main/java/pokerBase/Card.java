// Jaclyn SIngh, Tom Pollack, and Yue Lu
// Jaclyn - 100%
//Tom - 100%
//Yue Lu - 90%


package pokerBase;

import java.util.Comparator;

public class Card implements Comparable
{
	private eSuit eSuit;
	private eRank eRank;
	private int iCardNbr;
	public Card(eSuit eSuit, eRank eRank, int iCardNbr) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
		this.iCardNbr = iCardNbr;
	}
	
	public eSuit geteSuit() {
		return eSuit;
	}

	public eRank geteRank() {
		return eRank;
	}

	public int getiCardNbr() {
		return iCardNbr;
	}
	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

		   int Cno1 = c1.geteRank().getiRankNbr();
		   int Cno2 = c2.geteRank().getiRankNbr();

		   /*For descending order*/
		   return Cno2 - Cno1;

	   }};
	public int compareTo(Object o) 
	{
		Card c = (Card) o; 
	    return c.geteRank().compareTo(this.geteRank());
	}
}
