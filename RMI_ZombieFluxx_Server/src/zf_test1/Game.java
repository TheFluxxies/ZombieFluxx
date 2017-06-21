package zf_test1;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class Game implements Game_Interface{

	ArrayList<Player> allplayers = new ArrayList<Player>();
	
	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Game is Connected to Client");
	}

}
