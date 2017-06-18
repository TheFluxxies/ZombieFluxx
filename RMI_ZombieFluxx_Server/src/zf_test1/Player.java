package zf_test1;

import java.rmi.RemoteException;

public class Player implements Player_Interface{
	
	public Player(){
		
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
	
	

}
