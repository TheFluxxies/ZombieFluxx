package test_zf_1;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import zf_test1.Player;



public class SubmitInfoView extends Application{
	ArrayList<Player> allplayers = new ArrayList<Player>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	private GameMenu gameMenu; 
	Pane pane;
	InputStream is;
	Image img;
	private int breedte = 800 ;
	private int hoogte = 600;
	
	public void start(Stage arg0) throws RemoteException {

		pane = new Pane(); // Make new Pane named pane.
		pane.setPrefSize(breedte,hoogte); // Set window size to 800 by 600
		
		try {
			is = Files.newInputStream(Paths.get("res/images/zombieBackground2.jpg"));
			img = new Image(is); // Make a new Image named img and set background as image 
			is.close(); // close inputStream
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Import background image 
		
		ImageView imgView = new ImageView(img); // make new ImageView named imgView
		imgView.setFitWidth(breedte); // set image width
		imgView.setFitHeight(hoogte); // set image Height
		
		gameMenu = new GameMenu(); // Make new gameMenu
		
		pane.getChildren().addAll(imgView, gameMenu); // set image en gamemenu to pane 
		
		Scene scene = new Scene(pane); // create scene 
		
		arg0.setScene(scene); 
		arg0.show();
		
		
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
	HBox h = new HBox();
	HBox v = new HBox();
	Label l = new Label("Name: ");
	TextField t = new TextField();
	private class GameMenu extends Parent {
		public GameMenu() {
			
			
			// All the different buttons and what they do onmouseclick 
			MenuButton Continue = new MenuButton("Continue");
			Continue.setOnMouseClicked(event -> {
				Player x = new Player(t.getText());
			    allplayers.add(x);
			    System.out.println(x);
				
			});
			
			MenuButton Cancel = new MenuButton("Cancel");
			Cancel.setOnMouseClicked(event -> {
				
				
			});
			
			
			// set all buttons to menu0
			h.getChildren().addAll(Continue, Cancel);
			v.getChildren().addAll(l,t);
			v.setSpacing(10);
			
			v.setTranslateX(250);
			v.setTranslateY(300);
			
			h.setTranslateX(100);
			h.setTranslateY(500);
			// Make a gray rectangle in the background with a opacity 0.4
			Rectangle bg = new Rectangle(800, 600);
			bg.setFill(Color.GRAY);
			bg.setOpacity(0.4);
			
			getChildren().addAll(bg,h,v);
			
			Continue.setVisible(false);
			
			while(t.getText() != null){
				Continue.setVisible(true);
				    
				}
			}
			
		}
	}


