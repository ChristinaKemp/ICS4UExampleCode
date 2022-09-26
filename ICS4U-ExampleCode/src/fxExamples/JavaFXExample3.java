package fxExamples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * ExampleClass.java
 * This program shows some output examples
 * @author Christina Kemp
 * Sept 13, 2016
 *
 */
public class JavaFXExample3 extends Application{

	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of Window");
		button = new Button("Click Me!");
//		button.setText("Click Me!");
		button.setOnAction(e -> System.out.println("Lambda Expression")); //lambda expression, must be java 8 or higher
		
		/*
		button.setOnAction(e -> {
			System.out.println("Lambda Expression");
			System.out.println("Multiple lines of code go in braces");
		});
		*/
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}



}
