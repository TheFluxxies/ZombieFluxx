package test_zf_1;

import java.net.InetAddress;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javafx.application.Application;
import zf_test1.Card_Interface;
import zf_test1.Deck_Interface;
import zf_test1.Game_Interface;
import zf_test1.PlayerHand_Interface;
import zf_test1.Player_Interface;
import zf_test1.ZF_Interface;

public class GameClient{
		static ZF_Interface interfacestub;
		static Deck_Interface interfaceDeck;
		static Card_Interface interfaceCard;
		static Deck_Interface interfaceDiscard;
		static Game_Interface interfaceGame;
		static Player_Interface interfacePlayer;
		static PlayerHand_Interface interfacePlayerhand;
		
	public static void main(String[] args) {
		
		Registry registry;
		try {
			registry = LocateRegistry.getRegistry(InetAddress.getLocalHost().getHostAddress());
			interfacestub = (ZF_Interface) registry.lookup("ZF_Interface");
			interfaceDeck = (Deck_Interface) registry.lookup("Deck_Interface");
			interfaceCard = (Card_Interface) registry.lookup("Card_Interface");
			interfaceDiscard = (Deck_Interface) registry.lookup("Deck_Interface");
			interfaceGame = (Game_Interface) registry.lookup("Game_Interface");
			//interfacePlayer = (Player_Interface) registry.lookup("Player_Interface");
			interfacePlayerhand = (PlayerHand_Interface) registry.lookup("PlayerHand_Interface");
			
			
			interfaceDiscard.SayConnected();
			interfaceDeck.SayConnected();
			interfaceCard.SayConnected();
			interfaceGame.SayConnected();
			//interfacePlayer.SayConnected();
			interfacePlayerhand.SayConnected();
			
			
			
			Application.launch(MenuView.class, args);
			
			
			System.out.println("Done!");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
	}
	}

	
		
	
	

