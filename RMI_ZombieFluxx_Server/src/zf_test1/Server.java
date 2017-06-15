package zf_test1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	public Server(){
		try{
			ZF_Impl zf_impl  = new ZF_Impl();
			Deck deck = new Deck();
			Discard discard = new Discard();
			Game game = new Game();
			
			ZF_Interface InterfaceSkeleton = (ZF_Interface) UnicastRemoteObject.exportObject(zf_impl, 0);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("ZF_Interface", InterfaceSkeleton);
			System.out.println("Server running...");
			
			
		} catch (Exception e) {
			System.out.println("Exception" + e);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		new Server().runServer();
	}
	private void runServer(){
		
	}
}
