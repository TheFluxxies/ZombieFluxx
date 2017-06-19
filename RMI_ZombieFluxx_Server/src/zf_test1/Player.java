package zf_test1;

import java.rmi.RemoteException;

public class Player implements Player_Interface{
	String naam;
	public Player(String naam){
		this.naam = naam;
	}
	
	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Player is Connected to Client");
	}
	@Override
	public void getNaam() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getPlayerHand() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getPlayerPlays() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String naam) throws RemoteException {
		// TODO Auto-generated method stub
		this.naam = naam;
	}

	

	
	
	

}
