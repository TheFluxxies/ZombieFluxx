package test_zf_1;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.GroupLayout.Alignment;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;



public class LobbyView extends Application{

	
public static void main(String[] args) {
		
		launch();
	}
	
	private Pane pane;
	private InputStream is;
	private Image img;
	private int breedte = 800 ;
	private int hoogte = 600;
	@Override
	public void start(Stage arg0) throws Exception {
		
		pane = new Pane(); // Make new Pane named pane.
		pane.setPrefSize(breedte,hoogte); // Set window size to 800 by 600
		
		is = Files.newInputStream(Paths.get("res/images/zombieBackground2.jpg")); // Import background image 
		img = new Image(is); // Make a new Image named img and set background as image 
		is.close(); // close inputStream
		
		ImageView imgView = new ImageView(img); // make new ImageView named imgView
		imgView.setFitWidth(breedte); // set image width
		imgView.setFitHeight(hoogte); // set image Height
		
		Players p = new Players();
		
		pane.getChildren().addAll(imgView,p); // set image en gamemenu to pane 
		
		Scene scene = new Scene(pane); // create scene 
		
		arg0.setScene(scene); // setScene
		arg0.show(); 
	}
	
	private static class lobbyPlayer extends StackPane{ 
		private Text text;
		
		public lobbyPlayer(String name){
			// Text formate 
			text = new Text(name);
			text.getFont();
			text.setFont(Font.font(30));
			text.setFill(Color.WHITE);
			text.setTextAlignment(TextAlignment.CENTER);
			
			// menu button background.
			Rectangle bg = new Rectangle(250, 40);
			bg.setOpacity(0.5);
			bg.setFill(Color.BLACK);
			bg.setEffect(new GaussianBlur(3.5));
			
			// 
			setAlignment(Pos.CENTER);
			setRotate(0.5);
			getChildren().addAll(bg, text);
			
			// What happens when you go over the buttons with your mouse 
			setOnMouseEntered(event -> {
				bg.setTranslateX(0);
				text.setTranslateX(0);
				//bg.setFill(Color.RED);
				text.setFill(Color.RED);
			});
			
			// What happens when your mouse leaves the button 
			setOnMouseExited(event -> {
				bg.setTranslateX(0);
				text.setTranslateX(0);
				//bg.setFill(Color.BLACK);
				text.setFill(Color.WHITE);
			});
			
			// What happens when you click on a button with your mouse 
			DropShadow drop = new DropShadow(50, Color.RED);
			drop.setInput(new Glow());
			
			setOnMousePressed(event -> setEffect(drop));
			setOnMouseReleased(event -> setEffect(null));
			
			
		}

	}
	
	private class Players extends Parent {
		public Players() {
			VBox menu0 = new VBox(10);
			HBox menu1 = new HBox(10);
			
			menu0.setTranslateX(300);
			menu0.setTranslateY(200);
			
			menu1.setTranslateX(250);
			menu1.setTranslateY(500);
			
			
			// All the different buttons and what they do onmouseclick 
			lobbyPlayer Player1 = new lobbyPlayer("Player1");
			Player1.setOnMouseClicked(event -> {
				// onmouseclicked remove this player from lobby list 
				
			});
			
			lobbyPlayer Player2 = new lobbyPlayer("Player2");
			Player2.setOnMouseClicked(event -> {
				// onmouseclicked remove this player from lobby list
				
			});
			
			lobbyPlayer Player3 = new lobbyPlayer("Player3");
			Player3.setOnMouseClicked(event -> {
				// onmouseclicked remove this player from lobby list
				
			});
			
			lobbyPlayer Player4 = new lobbyPlayer("Player4");
			Player4.setOnMouseClicked(event -> {
				// onmouseclicked remove this player from lobby list
				
			});
			
			lobbyPlayer buttonContinue = new lobbyPlayer("Continue");
			buttonContinue.setOnMouseClicked(event -> {
				// onmouseclicked remove this player from lobby list
				
			});
			
			lobbyPlayer buttonCancel = new lobbyPlayer("Cancel");
			buttonCancel.setOnMouseClicked(event -> {
				// onmouseclicked remove this player from lobby list
				
			});
			
			// set all buttons to menu0
			menu0.getChildren().addAll(Player1, Player2, Player3, Player4);
			
			// set buttons for menu1
			menu1.getChildren().addAll(buttonContinue, buttonCancel);
						
			// Make a gray rectangle in the background with a opacity 0.4
			Rectangle bg = new Rectangle(800, 600);
			bg.setFill(Color.GRAY);
			bg.setOpacity(0.4);
			
			getChildren().addAll(bg,menu0,menu1);
			
			
		}
	}

}
