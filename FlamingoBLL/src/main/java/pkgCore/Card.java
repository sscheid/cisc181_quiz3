package pkgCore;
import pkgEnum.*;

public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eRank eRank;
	private eSuit eSuit;

	//	TODO: Build a constructor for Card passing in eRank and eSuit	
	public Card(pkgEnum.eRank eRank, pkgEnum.eSuit eSuit) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}

	public eRank geteRank() {
		return eRank;
	}

	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		//return 0;
		return c.geteRank().compareTo(this.geteRank());
		}
	
	
	
}
