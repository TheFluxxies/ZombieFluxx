package test_zf_1;



import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
//import nl.hsleiden.rmi.counter.client.CounterController;

public class MenuView extends Application {

	private GameMenu gameMenu; 
	Pane pane;
	InputStream is;
	Image img;
	private int breedte = 800 ;
	private int hoogte = 600;
	
	Stage arg0 = new Stage();
	public void start(Stage arg0) throws RemoteException {
		this.arg0 = arg0;
		pane = new Pane(); // Make new Pane named pane.
		pane.setPrefSize(breedte,hoogte); // Set window size to 800 by 600
		Scene scene = new Scene(pane); // create scene 
		
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
		
		arg0.setScene(scene); 
		arg0.show();
	}
	Desktop desktop = Desktop.getDesktop();
	private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(
                MenuView.class.getName()).log(
                    Level.SEVERE, null, ex
                );
        }
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
			SubmitInfoView siv = new SubmitInfoView();
			SubmitPlayerInfoView spiv = new SubmitPlayerInfoView();
			VBox menu0 = new VBox(10);
			VBox menu1 = new VBox(10);
			
			menu0.setTranslateX(100);
			menu0.setTranslateY(200);
			
			menu1.setTranslateX(100);
			menu1.setTranslateY(200);
			
			final int offset = 400;
			
			menu1.setTranslateX(offset);
			
			// All the different buttons and what they do onmouseclick 
			MenuButton buttonStart = new MenuButton(" Start Game");
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
			
			
			
			MenuButton buttonJoin = new MenuButton("  Join Game");
			buttonJoin.setOnMouseClicked(event -> {
				try {
					spiv.start(spiv.arg1);
					arg0.close();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
				
			});
			
			MenuButton buttonRules = new MenuButton("  Rules");
			buttonRules.setOnMouseClicked(event -> {
				
				
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
				
				try {
					siv.start(siv.arg0);
					arg0.close();
					
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
				//System.exit(0); // close the programme.
				
			});
			
			MenuButton buttonLoad = new MenuButton("  Load Game");
			buttonLoad.setOnMouseClicked(event -> {
				//FadeTransition ft = new FadeTransition(Duration.seconds(1), this);
				//ft.setFromValue(1);
				//ft.setToValue(0);
				//ft.setOnFinished(evt -> this.setVisible(false));
				//ft.play();
				FileChooser fileChooser = new FileChooser();
				File file = fileChooser.showOpenDialog(arg0);
                if (file != null) {
                    openFile(file);
                }
			});
			
			// set all buttons to menu0
			menu0.getChildren().addAll(buttonStart, buttonJoin, buttonRules, buttonQuit);
			
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
