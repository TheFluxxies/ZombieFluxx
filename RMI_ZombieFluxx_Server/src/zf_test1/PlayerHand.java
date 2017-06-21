package zf_test1;


import java.rmi.RemoteException;

import javafx.collections.ObservableList;
import javafx.scene.Node;

public class PlayerHand implements PlayerHand_Interface{
	ObservableList<Node> cards;

	public PlayerHand(){

	}

	public PlayerHand(ObservableList<Node> cards){
		this.cards = cards;
	}

	public void DrawCard(Card card){
		cards.add(card);

}

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCards() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCard() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveCard() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlays() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
