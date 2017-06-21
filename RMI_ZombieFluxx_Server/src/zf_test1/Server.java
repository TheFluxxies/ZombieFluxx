package zf_test1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	public Server(){
		try{
			ZF_Impl zf_impl  = new ZF_Impl();
			//Card card = new Card("Brians");
			Deck deck = new Deck();
			Discard discard = new Discard();
			Game game = new Game();
			Player player = new Player();
			PlayerHand ph = new PlayerHand();
			
			
			ZF_Interface InterfaceSkeleton = (ZF_Interface) UnicastRemoteObject.exportObject(zf_impl, 0);
			//Card_Interface card_int = (Card_Interface) UnicastRemoteObject.exportObject(card, 0);
			Deck_Interface deck_int = (Deck_Interface) UnicastRemoteObject.exportObject(deck, 0);
			Deck_Interface discard_int = (Deck_Interface) UnicastRemoteObject.exportObject(discard, 0);
			Game_Interface game_int = (Game_Interface) UnicastRemoteObject.exportObject(game, 0);
			Player_Interface player_int = (Player_Interface) UnicastRemoteObject.exportObject(player, 0);
			PlayerHand_Interface ph_int = (PlayerHand_Interface) UnicastRemoteObject.exportObject(ph, 0);
			
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("ZF_Interface", InterfaceSkeleton);
			//registry.rebind("Card_Interface", card_int);
			registry.rebind("Deck_Interface", deck_int);
			registry.rebind("Discard_Interface", discard_int);
			registry.rebind("Game_Interface", game_int);
			registry.rebind("Player_Interface", player_int);
			registry.rebind("PlayerHand_Interface", ph_int);
			
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
