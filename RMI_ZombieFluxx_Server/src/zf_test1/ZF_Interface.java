package zf_test1;

import java.rmi.Remote;
import java.rmi.RemoteException;


	public interface ZF_Interface extends Remote {
		void sayHello() throws RemoteException;
		
	}

