package zf_test1;

import javafx.collections.ObservableList;
import javafx.scene.Node;

public class PlayerHand {
	ObservableList<Node> cards;

	public PlayerHand(ObservableList<Node> cards){
		this.cards = cards;
	}

	public void DrawCard(Card card){
		cards.add(card);
	}


}
