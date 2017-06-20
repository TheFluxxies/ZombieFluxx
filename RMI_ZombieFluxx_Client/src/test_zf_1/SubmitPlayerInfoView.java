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

public class SubmitPlayerInfoView extends Application{

static ArrayList<Player> allplayers = new ArrayList<Player>();
	
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
	Stage arg1 = new Stage();
	public void start(Stage arg1) throws RemoteException {
		this.arg1 = arg1;
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
		
		arg1.setScene(scene); 
		arg1.show();
		
		
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
	HBox v2 = new HBox();
	Label l = new Label  ("Name:      ");
	Label l1 = new Label ("Server Ip: ");
	TextField t = new TextField();
	TextField t2 = new TextField();
	MenuButton Continue = new MenuButton("Continue");
	MenuButton Cancel = new MenuButton("Cancel");
	private class GameMenu extends Parent {
		public GameMenu() throws RemoteException {
			
			
			MenuView s = new MenuView();
			// All the different buttons and what they do onmouseclick 
			
			
			Continue.setOnMouseClicked(event -> {
				if (allplayers.size() > 3){
					System.err.println("ERROR : MAX PLAYER REACHED");
					l.setFont(Font.font(40));
					l.setTextFill(Color.RED);
					l.setText("MAX PLAYER REACHED");
					t.setVisible(false);
									}else{
					
					Player x = new Player(t.getText());
				    allplayers.add(x);
				    System.out.println(x);
				    System.out.println(allplayers);
				    LobbyView lv = new LobbyView();
				    try {
						lv.start(lv.arg0);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			});
			
			
			Cancel.setOnMouseClicked(event -> {
				
				
				try {
					s.start(s.arg0);
					arg1.close();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			});
			
			t.setOnAction(e ->{
				if (t.getText() != null){
					Continue.setVisible(true);
				}else{
					Continue.setVisible(false);
				}
			});
			// set all buttons to menu0
			h.getChildren().addAll(Continue, Cancel);
			v.getChildren().addAll(l,t);
			v2.getChildren().addAll(l1,t2);
			v.setSpacing(10);
			v2.setSpacing(10);
			
			// Name and textfield 
			v.setTranslateX(250);
			v.setTranslateY(250);
			// Ip and textfield
			v2.setTranslateX(250);
			v2.setTranslateY(300);
			// buttons 
			h.setTranslateX(250);
			h.setTranslateY(500);
			// Make a gray rectangle in the background with a opacity 0.4
			Rectangle bg = new Rectangle(800, 600);
			bg.setFill(Color.GRAY);
			bg.setOpacity(0.4);
			
			getChildren().addAll(bg,h,v,v2);
			
			
			
		}
		
	
}

}
