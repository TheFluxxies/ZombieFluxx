package zf_test1;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class PlayerHand implements PlayerHand_Interface{
		
	ArrayList<Card> hand = new ArrayList<Card>();
	
	public PlayerHand(){
	
		}
	
	
	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Playerhand is Connected to Client");
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
	
	public void makeHand(){
		
		
	}

	@Override
	public void setPlays() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
