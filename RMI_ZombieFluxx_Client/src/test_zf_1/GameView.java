package test_zf_1;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

<<<<<<< HEAD
	public static void main(String[] args) {
		
=======
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameView extends Application {
>>>>>>> ac3b81dfa0edf741e7b7cc5f860881d273c57649

	public static void main(String[] args) {
			launch();
	}	
	
	Pane pane;
	Pane pane1;
	InputStream is;
	Image img;
	private int breedte = 1800 ;
	private int hoogte = 1000;
	public void start(Stage arg0) throws Exception {
		
		pane = new Pane(); // Make new Pane named pane.
		pane1 = new Pane();
		pane.setPrefSize(breedte,hoogte); // Set window size to 800 by 600
		
		is = Files.newInputStream(Paths.get("res/images/Achtergrond.jpg")); // Import background image 
		img = new Image(is); // Make a new Image named img and set background as image 
		is.close(); // close inputStream
		
		ImageView imgView = new ImageView(img); // make new ImageView named imgView
		imgView.setFitWidth(breedte); // set image width
		imgView.setFitHeight(hoogte); // set image Height
		
		StackPane sp = new StackPane();
		StackPane sp1 = new StackPane();
		VBox v = new VBox();
		VBox b = new VBox();
		
		
		Rectangle bg = new Rectangle(400, 1000);
		bg.setFill(Color.BLACK);
		//bg.setOpacity(0.4);
		
		Rectangle bg1 = new Rectangle(300, 1000);
		bg1.setFill(Color.RED);
		bg1.setOpacity(0.4);
		
		v.getChildren().addAll(bg);
	
		
		b.getChildren().addAll(bg1);
		
		
		sp.getChildren().addAll(v);
		sp.setAlignment(Pos.BASELINE_LEFT);
		sp1.getChildren().addAll(b);
		sp1.setAlignment(Pos.BASELINE_RIGHT);
		
		pane.getChildren().addAll(imgView,sp,sp1); // set image en gamemenu to pane 
		
		Scene scene = new Scene(pane); // create scene 
		
		arg0.setScene(scene); // setScene
		arg0.show(); 
	}

}
