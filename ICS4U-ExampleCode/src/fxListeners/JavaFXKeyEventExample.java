package fxListeners;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * This example shows three different ways to add a KeyEvent handler to a canvas object
 * in JavaFX. The first method adds an EventFilter and specifies the type of event,
 * the second adds the specific event to the canvas and uses an inner class to code the handler,
 * the third uses a Lambda expression to code the handler.
 * March 2021
 * 
 * @author Christina Kemp
 *
 */
public class JavaFXKeyEventExample extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * This method is called when the Application is launched by the JavaFX runtime. It sets the 
	 * look of the GUI and adds KeyEvent listeners.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("KeyEvent Example");
		Canvas canvas = new Canvas();
				
		// This line makes sure that the canvas has the focus so that the key presses are registered
		canvas.setFocusTraversable(true);
		
		// method 1: add event filter, set the event type, code the inner class
		// KEY_TYPED Event
		canvas.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
			/**
			 *  Prints the character that was typed to the system console
			 *  @param event - the KeyEvent that triggered the handler
			 */
			@Override
			public void handle(KeyEvent event) {
				System.out.println(event.getCharacter());
			}
		});
		
		
		// method 2: set the specific event type using the matching method, code the inner class
		// KEY_RELEASED event
		canvas.setOnKeyReleased(new EventHandler<KeyEvent>() {
			/**
			 * Prints the KeyCode field of that was typed to the system console when that key is released.
			 * @param event - the KeyEvent that triggered the handler
			 */
			@Override
			public void handle(KeyEvent event) {
				System.out.println("You let go of key: " + event.getCode());				
			}
		});
		
		
		// method 3: set the event using the matching method, use Lambda Expression to code handler
		// KEY_PRESSED event
		// you can also use canvas.setOnKeyTyped and canvas.setOnKeyReleased
		/**
		 * Prints "A key was pressed" to the system console when the letter 'A' is pressed.
		 */
		canvas.setOnKeyPressed(event -> {
		    if (event.getCode() == KeyCode.A) {
		        System.out.println("A key was pressed");
		    }
		});
		
		
		Group group = new Group();
		group.getChildren().add(canvas);
		Scene scene = new Scene(group, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
