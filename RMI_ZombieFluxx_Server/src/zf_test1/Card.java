package zf_test1;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.shape.Rectangle;
import javafx.scene.Parent;


public class Card extends Parent implements Card_Interface{

	private static final int CARD_WIDTH = 120;
	private static final int CARD_HEIGHT = 179;

	//public final Type type;
	public final String name;
	public final String type;

	public Card(String type, String name) throws IOException{
		//this.type = type;
		this.name = name;
		this.type = type;


	Rectangle bg = new Rectangle(CARD_WIDTH, CARD_HEIGHT);

	InputStream is = Files.newInputStream(Paths.get("res/image/kaarten nieuw/"+name+".png"));
	Image imgCard = new Image(is);
	is.close();

	ImageView view = new ImageView(imgCard);
	view.setFitWidth(CARD_WIDTH);
	view.setFitHeight(CARD_HEIGHT);


	getChildren().addAll(bg, view);
	}

	@Override
	public void setCard() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub

	}
}