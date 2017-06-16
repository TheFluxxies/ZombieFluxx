package zf_test1;

import java.rmi.RemoteException;

public class Game implements Game_Interface{

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Game is Connected to Client");
	}

}
