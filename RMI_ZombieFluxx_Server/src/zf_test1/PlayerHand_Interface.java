package zf_test1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PlayerHand_Interface extends Remote{
	void SayConnected() throws RemoteException;
}
