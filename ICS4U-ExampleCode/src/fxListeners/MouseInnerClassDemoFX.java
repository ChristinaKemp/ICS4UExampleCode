package fxListeners;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This class demonstrates how to use the MouseEvent class with Anonymous Inner Classes
 * @since May 10, 2018
 * @author Christina Kemp
 **/
public class MouseInnerClassDemoFX extends Application {
	/**
	 * the position at which the last mouse down event happened
	 **/
	double x = -1;
	double y = -1;

	/**
	 * Set to true if it's a mouse dragged event
	 **/
	boolean filled = false;

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

		canvas.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() { //inner class
			/**
			 * Prints the location to the system console
			 */
			@Override
			public void handle(MouseEvent event) {
				System.out.println("Mouse clicked: " + event.getX() + ", " + event.getY());				
			}
		});

		canvas.addEventFilter(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>() { //inner class
			@Override
			public void handle(MouseEvent event) {
				filled = false;
				x = event.getX ();
				y = event.getY ();
				System.out.println("Postition: " + x + ", " + y);	
				draw(gc);
			}
		});
		
		canvas.addEventFilter(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() { //inner class
			@Override
			public void handle(MouseEvent event) {
				filled = true;
				x = event.getX();
				y = event.getY();
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
	 * @param gc The graphics context
	 **/
	public void draw (GraphicsContext gc)
	{
		gc.setFill(Color.BLUE);
		if (filled)
			gc.fillOval(x,y,50,50);
		else
			gc.strokeOval(x,y,50,50);
	}



}
