package zf_test1;

import java.rmi.RemoteException;

public class ZF_Impl implements ZF_Interface{

	@Override
	public void sayHello() throws RemoteException {
		System.out.println("Hoi");
		
	}

}
