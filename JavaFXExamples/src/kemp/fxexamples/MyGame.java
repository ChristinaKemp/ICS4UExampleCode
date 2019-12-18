package kemp.fxexamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyGame extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My Game!!!!!");
		Button myButton = new Button("Click Me!");
		Button button2 = new Button("I'm #2");
		
		HBox layout = new HBox();
		layout.getChildren().add(myButton);
		layout.getChildren().add(button2);
		
		AnchorPane.setRightAnchor(layout, 2.0);

		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}



}
