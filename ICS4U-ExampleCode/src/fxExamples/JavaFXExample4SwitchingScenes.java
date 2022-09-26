package fxExamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Example class for switching scenes in JavaFX
 * This program shows how to create two basic scenes, one in the start
 * method, one in its own method. And have the scenes switch when a button
 * is pressed.
 * Updated March 2021
 * @author Christina Kemp
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
		
		//layout scene1 - vertical column
		Label label1 = new Label("This is the first scene");
		Button button1 = new Button("Click to go to the second scene");
		button1.setOnAction(e -> {
			primaryStage.setScene(scene2);
		});
			
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		//use method to create layout of scene 2
		scene2 = scene2(primaryStage);
		
		primaryStage.setScene(scene2);
		primaryStage.show();
		
	}

	/**
	 * Create layout for scene 2
	 * @param stage 
	 * @return
	 */
	public Scene scene2(Stage stage) {
		Label label2 = new Label("Go back to scene 1");
		Button button2 = new Button("Click to go back");
		button2.setOnAction(e -> { 
			stage.setScene(scene1);
		});
		
		//layout scene2 - stack pane
		HBox layout2 = new HBox();
		layout2.getChildren().addAll(label2, button2);
		
		return new Scene(layout2, 600, 300);
	}

}
