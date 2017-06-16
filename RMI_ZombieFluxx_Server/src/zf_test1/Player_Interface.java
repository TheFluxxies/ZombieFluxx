package zf_test1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Player_Interface extends Remote {
	void SayConnected() throws RemoteException;
	
}
