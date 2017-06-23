package test_zf_1;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class CardView extends Application{
	//static Deck deck = new Deck();
	//ArrayList<String> NewRules = new ArrayList<String>();
	public static void main(String[] args){

		//deck.startUp();
		launch();

	}

	private VBox Hand = new VBox(-115);
	private VBox Keeper = new VBox(-125);
	private VBox Creeper = new VBox(-125);
	private HBox New_Rules = new HBox(22);

	private Hand new_rules;
	private Hand player, creeper, keeper, zombies2, zombies3, zombies4;
	private Deck deck = new Deck();
	private DiscardPile discardPile1 = new DiscardPile();

	int breedte = 1280;
	int lengte = 720;

	@Override
	public void start(Stage primaryStage) throws Exception {


		Pane pane = new Pane();
		pane.setPrefSize(breedte, lengte);
		InputStream is = Files.newInputStream(Paths.get("res/image/BordLeeg.jpg"));
		Image img = new Image(is);
		is.close();

		ImageView imgView = new ImageView(img);
		imgView.setFitWidth(breedte);
		imgView.setFitHeight(lengte);

		InputStream rules = Files.newInputStream(Paths.get("res/image/ZombieFluxxRules.back__0.png"));
		Image imgRules = new Image(rules);
		rules.close();

		ImageView imgRulesView = new ImageView(imgRules);
		ScrollPane scrollpane1 = new ScrollPane();
		scrollpane1.setPrefSize(600,400);
		scrollpane1.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
		scrollpane1.setContent(imgRulesView);

		scrollpane1.setVisible(false);

		InputStream cardback = Files.newInputStream(Paths.get("res/image/kaarten nieuw/fluxx_zwart.png"));
		Image imgCardBack = new Image(cardback);
		cardback.close();

		ImageView imgCardBackView = new ImageView(imgCardBack);
		imgCardBackView.setLayoutX(326);
		imgCardBackView.setLayoutY(575);
		imgCardBackView.setFitHeight(82);
		imgCardBackView.setFitWidth(140);

		Text empty = new Text("EMPTY");
		empty.setLayoutX(325);
		empty.setLayoutY(635);
		empty.setFont(Font.font(45));
		empty.setFill(Color.DARKRED);
		empty.setVisible(false);


		Text discardPile = new Text("0");
		discardPile.setLayoutX(breedte-430);
		discardPile.setLayoutY(635);
		discardPile.setFont(Font.font(75));
		discardPile.setFill(Color.DARKRED);

		player = new Hand(Hand.getChildren());
		creeper = new Hand(Creeper.getChildren());
		keeper = new Hand(Keeper.getChildren());
		new_rules = new Hand(New_Rules.getChildren());

		Creeper.setLayoutX(breedte - 125);

		Keeper.setLayoutX(breedte - 125);
		Keeper.setLayoutY(lengte - 370);

		New_Rules.setLayoutX(325);
		New_Rules.setLayoutY(125);

		deck.startUp();

		imgCardBackView.setOnMouseClicked(e ->{
			Card card = deck.Draw();
			if(card.getCardType() == "Creepers"){
				creeper.DrawCard(card);
			} else if (card.getCardType() == "Keepers"){
				keeper.DrawCard(card);
			} else if (card.getCardType() == "New_Rule"){
				new_rules.DrawCard(card);
			} else {
				player.DrawCard(card);
			}

			if (deck.getDeckAmount() == 0){
				imgCardBackView.setVisible(false);
				empty.setVisible(true);
			}

			System.out.println(card.getCardType() + " " + deck.getDeckAmount() + " " + discardPile1.getDiscardPileAmount());
		});

		empty.setOnMouseClicked(e -> {
			int discardPileAmount = discardPile1.getDiscardPileAmount();
			for(int i = 0; i < discardPileAmount;i++){
				deck.toDeck(discardPile1.Empty(i));
			}
			discardPile.setText(Integer.toString(discardPile1.getDiscardPileAmount()));
			empty.setVisible(false);
			imgCardBackView.setVisible(true);
		});

		Scene scene = new Scene(pane);

		pane.getChildren().addAll(imgView,imgCardBackView,empty,discardPile,scrollpane1,Hand, Creeper, Keeper, New_Rules);
		primaryStage.setScene(scene);
		primaryStage.show();

	}


	int getBreedte(){
		return breedte;
	}

	int getLengte(){
		return lengte;
	}


}
