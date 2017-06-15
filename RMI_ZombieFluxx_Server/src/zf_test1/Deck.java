package zf_test1;

import java.util.Arrays;
import java.util.Collections;


public class Deck implements Deck_Interface{
	
	private Card[] deck = new Card[100];
	
	private int topCard; 
	
	Deck() {
		topCard = 0;
		for (int i=0;i<deck.length;i++){
			deck[i] = new Card(i);
		}
	}
	
	public void shuffle(){
		topCard = 0;
		
		Collections.shuffle(Arrays.asList(deck));
	}
	
	public Card dealCard(){
		Card theCard;
		if (topCard < deck.length){
			theCard = deck[topCard];
			topCard++;
		}
		else{
			theCard = null;
			return theCard;
		}
	}
}
