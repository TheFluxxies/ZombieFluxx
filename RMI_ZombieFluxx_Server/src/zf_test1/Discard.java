package zf_test1;


import java.io.IOException;
import java.rmi.RemoteException;

public class Discard implements Deck_Interface{

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Discard Pile is Connected to Client");
	}

	@Override
	public void addCard() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCard() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startUp() throws RemoteException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCard(String Card) throws RemoteException {
		// TODO Auto-generated method stub
		
	}


}
