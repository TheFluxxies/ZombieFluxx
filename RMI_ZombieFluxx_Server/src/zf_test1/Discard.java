package zf_test1;

import java.rmi.RemoteException;

public class Discard implements Discard_Interface{

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Discard Pile is Connected to Client");
	}

}
