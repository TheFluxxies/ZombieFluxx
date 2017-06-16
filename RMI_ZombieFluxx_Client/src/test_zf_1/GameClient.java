package test_zf_1;

import java.awt.TextField;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.sun.glass.ui.Window;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import zf_test1.Card_Interface;
import zf_test1.Deck_Interface;
import zf_test1.Discard_Interface;
import zf_test1.Game_Interface;
import zf_test1.PlayerHand_Interface;
import zf_test1.Player_Interface;
import zf_test1.ZF_Interface;

public class GameClient extends Application {
		static ZF_Interface interfacestub;
		static Deck_Interface interfaceDeck;
		static Card_Interface interfaceCard;
		static Discard_Interface interfaceDiscard;
		static Game_Interface interfaceGame;
		static Player_Interface interfacePlayer;
		static PlayerHand_Interface interfacePlayerhand;
		
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Registry registry = LocateRegistry.getRegistry("127.0.0.1");
		interfacestub = (ZF_Interface) registry.lookup("ZF_Interface");
		interfacestub.sayHello();
		interfaceDeck = (Deck_Interface) registry.lookup("Deck_Interface");
		interfaceCard = (Card_Interface) registry.lookup("Card_Interface");
		interfaceDiscard = (Discard_Interface) registry.lookup("Discard_Interface");
		interfaceDiscard.SayConnected();
		interfaceGame = (Game_Interface) registry.lookup("Game_Interface");
		interfaceGame.SayConnected();
		interfacePlayer = (Player_Interface) registry.lookup("Player_Interface");
		interfacePlayer.SayConnected();
		interfacePlayerhand = (PlayerHand_Interface) registry.lookup("PlayerHand_Interface");
		interfacePlayerhand.SayConnected();
		
		MenuView mv = new MenuView();
		
		System.out.println("Done!");
		Button startbutton = new Button("Start");
		TextField infield = new TextField();
		VBox vbox = new VBox(10);
		
		vbox.getChildren().addAll(startbutton, infield, mv);
		vbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vbox, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Lobby");
		primaryStage.show();
	
	}
		
	
	
}
