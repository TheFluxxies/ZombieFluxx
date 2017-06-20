package zf_test1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.Parent;


public class Card extends Parent implements Card_Interface{

	private static final int CARD_WIDTH = 120;
	private static final int CARD_HEIGHT = 179;

	enum Type {
		GOAL, KEEPER, CREEPER, NEW_RULE, ACTION;
		Type(){

		}
	}

	//public final Type type;
	public final String name;

	public Card(/*Type type, */String name) throws IOException{
		//this.type = type;
		this.name = name;


	Rectangle bg = new Rectangle(CARD_WIDTH, CARD_HEIGHT);

	InputStream is = Files.newInputStream(Paths.get("res/image/KaartenAF/New Rule/"+name+".png"));
	Image imgCard = new Image(is);
	is.close();

	ImageView view = new ImageView(imgCard);
	view.setFitWidth(CARD_WIDTH);
	view.setFitHeight(CARD_HEIGHT);


	getChildren().addAll(bg, view);
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
