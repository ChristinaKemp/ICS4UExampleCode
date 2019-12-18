package kemp.listeners;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This class demonstrates how to use the canvas event methods for MouseEvents in an Application
 * May 2018.
 * @author Christina Kemp
 **/
public class MouseListenerDemoFX extends Application {
	
	/**
	 * counts the number of clicks so far
	 **/
	int mouseClicks = 0;
	/**
	 * true if the mouse button is down
	 **/
	boolean mouseButtonDown = false;
	/**
	 * true when mouse enters canvas window
	 **/
	boolean mouseInWindow = false;

	/**
	 * the position at which the last mouse down event happened
	 **/
	double x = -1;
	double y = -1;

	/**
	 * Main entry to program. Launches the applications
	 * @param args
	 * 			unused
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Start of the Application. 
	 * Sets all the GUI elements of the Application.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of Window");
		Canvas canvas = new Canvas(500, 500);
		final GraphicsContext gc = canvas.getGraphicsContext2D();

		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() { //inner class
			/**
			 * called when mouse clicked and released
			 * @param event The mouse event
			 **/
			@Override
			public void handle(MouseEvent event) {
				mouseClicks++;
				draw(canvas.getGraphicsContext2D());		
			}
		});

		canvas.setOnMouseEntered(new EventHandler<MouseEvent>() { //inner class
			/**
			 * called when mouse enters the canvas
			 * @param event The mouse event
			 **/
			@Override
			public void handle(MouseEvent event) {
				mouseInWindow = true;
				draw (gc);
			}
		});

		canvas.setOnMouseExited(new EventHandler<MouseEvent>() { //inner class
			/**
			 * called when mouse exits the canvas screen
			 * @param event The mouse event
			 **/
			@Override
			public void handle(MouseEvent event) {
				mouseInWindow = false;
				draw (gc);
			}
		});
		
		canvas.setOnMouseReleased(new EventHandler<MouseEvent>() { //inner class
			/**
			 * called when mouse button is released
			 * @param event The mouse event
			 **/
			@Override
			public void handle(MouseEvent event) {
				mouseButtonDown = false;
				draw(gc);
			}
		});

		canvas.setOnMousePressed(new EventHandler<MouseEvent>() { //inner class
			/**
			 * called when mouse button is pressed
			 * @param event The mouse event
			 **/
			@Override
			public void handle(MouseEvent e) {
				mouseButtonDown = true;
				x = e.getX ();
				y = e.getY ();
				draw(gc);
			}
		});

		//Group group = new Group();
		StackPane layout = new StackPane();
		layout.getChildren().add(canvas);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Display basic information from mouse listeners
	 * @param g The graphics context
	 **/
	public void draw (GraphicsContext gc){
		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
		gc.setStroke(Color.BLACK);
		gc.strokeText("Clicks: " + mouseClicks, 130, 150);
		if (mouseButtonDown)
			gc.strokeText("Down", 130, 170);
		else
			gc.strokeText ("Up", 130, 170);
		if (mouseInWindow)
			gc.strokeText ("In", 130, 190);
		else
			gc.strokeText("Out", 130, 190);
		
		gc.strokeText ("Last Down Position: (" + x + "," + y + ")", 130, 210);
	}

}
