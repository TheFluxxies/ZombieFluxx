package zf_test1;

import java.util.ArrayList;

public class Discard {

	ArrayList<Card> discardPile = new ArrayList<Card>();

	public void toDiscardPile(Card card){
		discardPile.add(card);
	}

	public Card Empty(int i){
		Card card = discardPile.get(i);
		discardPile.remove(i);
		return card;
	}

	public int getDiscardPileAmount(){
		return discardPile.size();
	}
}
