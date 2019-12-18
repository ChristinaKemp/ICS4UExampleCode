package kemp.fxexamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ExampleClass.java
 * This program shows some output examples
 * @author Christina Kemp
 * Sept 13, 2016
 *
 */
public class JavaFXExample4SwitchingScenes extends Application{

	Scene scene1, scene2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of Window");
		
		Label label1 = new Label("This is the first scene");
		Button button1 = new Button("Click to go to the second scene");
		button1.setOnAction(e -> primaryStage.setScene(scene2));
		
		//layout scene1 - vertical column
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		
		Label label2 = new Label("Go back to scene 1");
		Button button2 = new Button("Click to go back");
		button2.setOnAction(e -> primaryStage.setScene(scene1));
		
		//layout scene2 - stack pane
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, 600, 300);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
		
	}



}
