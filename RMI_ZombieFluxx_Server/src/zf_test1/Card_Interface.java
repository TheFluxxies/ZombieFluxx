package zf_test1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Card_Interface extends Remote {
	
	void getCard() throws RemoteException;
	void setCard() throws RemoteException;
}
