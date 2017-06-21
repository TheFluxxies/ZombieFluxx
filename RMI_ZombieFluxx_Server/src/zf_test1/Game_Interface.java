package zf_test1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Game_Interface extends Remote{
	void SayConnected() throws RemoteException;
	
}
