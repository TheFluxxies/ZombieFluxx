package test_zf_1;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import zf_test1.Card_Interface;
import zf_test1.Deck_Interface;
import zf_test1.Game_Interface;
import zf_test1.PlayerHand_Interface;
import zf_test1.Player_Interface;
import zf_test1.ZF_Interface;

public class GameClient extends Application{
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
			registry = LocateRegistry.getRegistry("127.0.0.1");
			interfacestub = (ZF_Interface) registry.lookup("ZF_Interface");
			interfaceDeck = (Deck_Interface) registry.lookup("Deck_Interface");
			interfaceCard = (Card_Interface) registry.lookup("Card_Interface");
			interfaceDiscard = (Deck_Interface) registry.lookup("Deck_Interface");
			interfaceGame = (Game_Interface) registry.lookup("Game_Interface");
			interfacePlayer = (Player_Interface) registry.lookup("Player_Interface");
			interfacePlayerhand = (PlayerHand_Interface) registry.lookup("PlayerHand_Interface");
			
			interfacestub.sayHello();
			interfaceDiscard.SayConnected();
			interfaceDeck.SayConnected();
			interfaceCard.SayConnected();
			interfaceGame.SayConnected();
			interfacePlayer.SayConnected();
			interfacePlayerhand.SayConnected();
			
			Application.launch(MenuView.class, args);
			
			
			
			System.out.println("Done!");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GameMenu gameMenu; 
		Pane pane;
		InputStream is;
		Image img;
		int breedte = 800 ;
		int hoogte = 600;
		
	

			pane = new Pane(); // Make new Pane named pane.
			pane.setPrefSize(breedte,hoogte); // Set window size to 800 by 600
			
			try {
				is = Files.newInputStream(Paths.get("res/images/zombieBackground2.jpg"));
				img = new Image(is); // Make a new Image named img and set background as image 
				is.close(); // close inputStream
				ImageView imgView = new ImageView(img); // make new ImageView named imgView
				imgView.setFitWidth(breedte); // set image width
				imgView.setFitHeight(hoogte); // set image Height
				
				gameMenu = new GameMenu(); // Make new gameMenu
				
				pane.getChildren().addAll(imgView, gameMenu); // set image en gamemenu to pane 
				
				Scene scene = new Scene(pane); // create scene 
				
				primaryStage.setScene(scene); 
				primaryStage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Import background image 
			
		}
		
		private static class MenuButton extends StackPane{ 
			private Text text;
			
			public MenuButton(String name){
				// Text formate 
				text = new Text(name);
				text.getFont();
				text.setFont(Font.font(20));
				text.setFill(Color.WHITE);
				
				// menu button background.
				Rectangle bg = new Rectangle(250, 30);
				bg.setOpacity(0.5);
				bg.setFill(Color.BLACK);
				bg.setEffect(new GaussianBlur(3.5));
				
				// 
				setAlignment(Pos.CENTER_LEFT);
				setRotate(0.5);
				getChildren().addAll(bg, text);
				
				// What happens when you go over the buttons with your mouse 
				setOnMouseEntered(event -> {
					bg.setTranslateX(0);
					text.setTranslateX(0);
					bg.setFill(Color.GREEN);
					text.setFill(Color.WHITE);
				});
				
				// What happens when your mouse leaves the button 
				setOnMouseExited(event -> {
					bg.setTranslateX(0);
					text.setTranslateX(0);
					bg.setFill(Color.BLACK);
					text.setFill(Color.WHITE);
				});
				
				// What happens when you click on a button with your mouse 
				DropShadow drop = new DropShadow(50, Color.RED);
				drop.setInput(new Glow());
				
				setOnMousePressed(event -> setEffect(drop));
				setOnMouseReleased(event -> setEffect(null));
				
				
			}

		}
		
		private class GameMenu extends Parent {
			public GameMenu() {
				VBox menu0 = new VBox(10);
				VBox menu1 = new VBox(10);
				
				menu0.setTranslateX(100);
				menu0.setTranslateY(200);
				
				menu1.setTranslateX(100);
				menu1.setTranslateY(200);
				
				final int offset = 400;
				
				menu1.setTranslateX(offset);
				
				// All the different buttons and what they do onmouseclick 
				MenuButton buttonStart = new MenuButton("  New Game");
				buttonStart.setOnMouseClicked(event -> {
					FadeTransition ft = new FadeTransition(Duration.seconds(1), menu0);
					ft.setFromValue(1);
					ft.setToValue(0);
					//ft.setOnFinished(evt -> this.setVisible(false));
					ft.play();
					getChildren().add(menu1);
					TranslateTransition tt = new TranslateTransition(Duration.seconds(0.5), menu0);
					tt.setToX(menu1.getTranslateX() - offset);
					
					TranslateTransition tt1 = new TranslateTransition(Duration.seconds(1), menu1);
					tt1.setToX(menu0.getTranslateX());
					
					tt.play();
					tt1.play();
					
					tt.setOnFinished(evt ->{ getChildren().remove(menu0);});
					
				});
				
				MenuButton buttonResume = new MenuButton("  Load Game");
				buttonResume.setOnMouseClicked(event -> {
					
					
				});
				
				MenuButton buttonJoin = new MenuButton("  Join Game");
				buttonJoin.setOnMouseClicked(event -> {
					
					
				});
				
				MenuButton buttonRules = new MenuButton("  Rules");
				buttonRules.setOnMouseClicked(event -> {
					
					
				});
				
				MenuButton buttonOption = new MenuButton("  Options");
				buttonOption.setOnMouseClicked(event -> {
					getChildren().add(menu1);
					//Button animation
					TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25), menu0);
					tt.setToX(menu0.getTranslateX() - offset);
					
					TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.25), menu1);
					tt1.setToX(menu0.getTranslateX());
					
					tt.play();
					tt1.play();
					
					tt1.setOnFinished(evt ->{ getChildren().remove(menu1);});
					tt1.setOnFinished(evt -> menu1.setVisible(false));
				});
				
				MenuButton buttonQuit = new MenuButton("  Quit");
				buttonQuit.setOnMouseClicked(event -> {
					System.exit(0); // close the programme.
					
				});
				
				MenuButton buttonNewgame = new MenuButton("  New Game");
				buttonNewgame.setOnMouseClicked(event -> {
					FadeTransition ft = new FadeTransition(Duration.seconds(1), this);
					ft.setFromValue(1);
					ft.setToValue(0);
					ft.setOnFinished(evt -> this.setVisible(false));
					ft.play();
					
				});
				
				MenuButton buttonLoad = new MenuButton("  Load Game");
				buttonLoad.setOnMouseClicked(event -> {
					FadeTransition ft = new FadeTransition(Duration.seconds(1), this);
					ft.setFromValue(1);
					ft.setToValue(0);
					ft.setOnFinished(evt -> this.setVisible(false));
					ft.play();
					
				});
				
				
				// set all buttons to menu0
				menu0.getChildren().addAll(buttonStart, buttonResume, buttonJoin, buttonRules, buttonOption, buttonQuit);
				
				// set buttons for menu1
				menu1.getChildren().addAll(buttonNewgame, buttonLoad);
							
				// Make a gray rectangle in the background with a opacity 0.4
				Rectangle bg = new Rectangle(800, 600);
				bg.setFill(Color.GRAY);
				bg.setOpacity(0.4);
				
				getChildren().addAll(bg,menu0);
				
				
			}
		}
	}

	
		
	
	

