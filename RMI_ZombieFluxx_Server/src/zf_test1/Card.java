package zf_test1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class Card implements Card_Interface{
	
	
	public Card(int id){
		int breedte = 40;
		int hoogte = 100;
		InputStream is;
		Image img;
		this.ID = id;
		
		
		
		try {
			is = Files.newInputStream(Paths.get("res/images/"+(id.toString())+".png"));
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
	public void sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCard() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
