package zf_test1;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Deck_Interface extends Remote {
	void SayConnected() throws RemoteException;
	void startUp() throws RemoteException, IOException;
	void addCard() throws RemoteException;
	void removeCard(String Card) throws RemoteException;
	void getCard() throws RemoteException;
}
