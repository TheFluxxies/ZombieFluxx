package window;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.animation.FadeTransition;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MenuView extends Application {

	private GameMenu gameMenu;
	@Override
	public void start(Stage arg0) throws Exception {

		Pane pane = new Pane();
		pane.setPrefSize(800,600);
		
		InputStream is = Files.newInputStream(Paths.get("res/images/zombieBackground2.jpg"));
		Image img = new Image(is);
		is.close();
		
		ImageView imgView = new ImageView(img);
		imgView.setFitWidth(800);
		imgView.setFitHeight(600);
		
		gameMenu = new GameMenu();
		
		pane.getChildren().addAll(imgView, gameMenu);
		
		Scene scene = new Scene(pane);
		
		arg0.setScene(scene);
		arg0.show();
		
		
	}
	
	private static class MenuButton extends StackPane{
		private Text text;
		
		public MenuButton(String name){
			text = new Text(name);
			//text = setFont(text.getFont().font(20));
			text.setFill(Color.WHITE);
			
			Rectangle bg = new Rectangle(250, 30);
			bg.setOpacity(0.5);
			bg.setFill(Color.BLACK);
			bg.setEffect(new GaussianBlur(3.5));
			
			setAlignment(Pos.CENTER_LEFT);
			setRotate(0.5);
			getChildren().addAll(bg, text);
			
			setOnMouseEntered(event -> {
				bg.setTranslateX(0);
				text.setTranslateX(0);
				bg.setFill(Color.GREEN);
				text.setFill(Color.WHITE);
			});
			
			setOnMouseExited(event -> {
				bg.setTranslateX(0);
				text.setTranslateX(0);
				bg.setFill(Color.BLACK);
				text.setFill(Color.WHITE);
			});
			
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
			
			MenuButton buttonStart = new MenuButton("  Start Game");
			buttonStart.setOnMouseClicked(event -> {
				FadeTransition ft = new FadeTransition(Duration.seconds(1), this);
				ft.setFromValue(1);
				ft.setToValue(0);
				ft.setOnFinished(evt -> this.setVisible(false));
				ft.play();
				
			});
			
			MenuButton buttonResume = new MenuButton("  Resume Game");
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
				
				
			});
			
			MenuButton buttonQuit = new MenuButton("  Quit");
			buttonQuit.setOnMouseClicked(event -> {
				System.exit(0);
				
			});
			
			menu0.getChildren().addAll(buttonStart, buttonResume, buttonJoin, buttonRules, buttonOption, buttonQuit);
			Rectangle bg = new Rectangle(800, 600);
			bg.setFill(Color.GRAY);
			bg.setOpacity(0.4);
			
			getChildren().addAll(bg,menu0);
			
			
		}
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}
