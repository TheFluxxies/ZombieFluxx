package test_zf_1;


import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import zf_test1.Card;


public class BoardView extends Application {

	public static void main(String[] args) {
		
		launch();
	}
	
	Pane pane;
	InputStream is;
	Image img;
	private int breedte = 1200 ;
	private int hoogte = 1000;
	@Override
	public void start(Stage arg0) throws Exception {
		
		pane = new Pane(); // Make new Pane named pane.
		pane.setPrefSize(breedte,hoogte); // Set window size to 800 by 600
		
		is = Files.newInputStream(Paths.get("res/images/Achtergrond.jpg")); // Import background image 
		img = new Image(is); // Make a new Image named img and set background as image 
		is.close(); // close inputStream
		
		ImageView imgView = new ImageView(img); // make new ImageView named imgView
		imgView.setFitWidth(breedte); // set image width
		imgView.setFitHeight(hoogte); // set image Height
		
<<<<<<< HEAD
		//BoardView bv = new BoardView();
		
=======
		Card c = new Card("Brains");

>>>>>>> ac3b81dfa0edf741e7b7cc5f860881d273c57649
		
		pane.getChildren().addAll(imgView); // set image en gamemenu to pane 
		
		Scene scene = new Scene(pane); // create scene 
		
		arg0.setScene(scene); // setScene
		arg0.show(); 
	}

}
