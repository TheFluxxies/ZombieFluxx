package zf_test1;

import java.rmi.RemoteException;

public class Player implements Player_Interface{

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Player is Connected to Client");
	}

}
