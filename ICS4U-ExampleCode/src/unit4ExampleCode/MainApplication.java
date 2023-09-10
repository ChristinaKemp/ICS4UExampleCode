package unit4ExampleCode;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/**
 * Template Class for JavaFX application
 * @version 1.0 Dec. 2022
 * @author Christina Kemp
 *
 */
public class MainApplication extends Application{

	/**
	 * Entry point to program
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * This method gets called automatically on the application launch.
	 * You can use this to initialize items before the start() method is called.
	 * You do not NEED to use this method.
	 */
	public void init() {

	}
	
	/**
	 * Start of the application. This is called automatically after the init() method completes.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create your layout
		//Create your game thread
			//Be sure to call draw and update in your game thread
	
		//show your layout
		//start your game thread
	}
	
	/**
	 * This is a good method to use to draw on the canvas
	 * https://docs.oracle.com/javase/8/javafx/api/javafx/scene/canvas/GraphicsContext.html
	 * @param gc The GraphicsContext from the canvas you wish to draw on.
	 */
	public void draw(GraphicsContext gc) {
		
	}
	
	/**
	 * This is a useful method to update character positions, text box information, etc.
	 * If your other classes have their own update methods you should call those here.
	 */
	public void update() {
		
	}
	
	/**
	 * This method gets called automatically whenever someone clicks the x to close the window or
	 * when Platform.exit() is used in your program to end the application.
	 * This is a good place to turn off any music or save any data.
	 */
	public void stop() {
		
	}

	
	
}
