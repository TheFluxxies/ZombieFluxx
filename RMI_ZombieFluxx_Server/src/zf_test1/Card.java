package zf_test1;



import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class Card extends Parent{

	private static final int CARD_WIDTH = 87;
	private static final int CARD_HEIGHT = 148;

	enum Type {
		GOAL, KEEPER, CREEPER, NEW_RULE, ACTION;
		Type(){

		}
	}

	//public final Type type;
	public final String name;
	public final String type;

	CardView cardView = new CardView();

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

	view.setOnMouseEntered(e -> {
		view.setFitHeight(CARD_HEIGHT + 82);
		view.setFitWidth(CARD_WIDTH + 48);
	});
	view.setOnMouseExited(e -> {
		view.setFitWidth(CARD_WIDTH);
		view.setFitHeight(CARD_HEIGHT);
	});
	view.setOnMouseClicked(e -> {
		view.setLayoutY(0);
		view.setFitHeight(cardView.lengte);


	});

	getChildren().addAll(bg, view);
	}

	public String getCardType(){
		return type;
	}
}