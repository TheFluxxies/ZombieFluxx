package zf_test1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Player_Interface extends Remote {
	void SayConnected() throws RemoteException;
	void getNaam() throws RemoteException;
	void getPlayerHand() throws RemoteException;
	void getPlayerPlays() throws RemoteException;
	void setName(String naam) throws RemoteException;
	
}
