package test_zf_1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import zf_test1.ZF_Interface;

public class GameClient extends Application {
		static ZF_Interface interfacestub;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Registry registry = LocateRegistry.getRegistry("127.0.0.1");
		interfacestub = (ZF_Interface) registry.lookup("ZF_Interface");
		interfacestub.sayHello();
		Button startbutton = new Button("Start");
		TextField infield = new TextField();
		VBox vbox = new VBox(10);
	
		vbox.getChildren().addAll(startbutton, infield);
		vbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vbox, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Lobby");
		primaryStage.show();
	
	}
		
	
	
}
