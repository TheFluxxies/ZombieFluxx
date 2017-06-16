package zf_test1;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class Card implements Card_Interface{
	
	String naam;
	
	 ArrayList<String> cards = new ArrayList<String>();
	
	public Card(String naam){
		int breedte = 40;
		int hoogte = 100;
		InputStream is;
		Image img;
		this.naam = naam;
		
		try {
			is = Files.newInputStream(Paths.get("res/images/"+naam+".png"));
			img = new Image(is); // Make a new Image named img and set background as image 
			is.close(); // close inputStream
			
			ImageView imgView = new ImageView(img); // make new ImageView named imgView
			imgView.setFitWidth(breedte); // set image width
			imgView.setFitHeight(hoogte); // set image Height
			
			HBox h = new HBox();
			h.getChildren().addAll(imgView);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Import background image 
	}



	@Override
	public void setCard() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Card is Connected to Client");
	}

	
	
	
}
