package zf_test1;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class PlayerHand implements PlayerHand_Interface{
		
	ArrayList<String> hand = new ArrayList<String>();

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Playerhand is Connected to Client");
	}
}
