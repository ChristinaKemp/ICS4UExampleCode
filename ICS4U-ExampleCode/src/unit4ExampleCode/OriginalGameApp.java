package unit4ExampleCode;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This is the beginning of a simple game. The program creates 100 FlashingBall
 * objects with random colours and speeds. The balls are drawn onto a JavaFX canvas.
 * 
 * Your task is to expand this starter code into a dodgeball game 
 * where the user controls an object with the mouse or keyboard and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * December 9, 2007.
 * 
 * @author Sam Scott
 */
public class OriginalGameApp extends Application{

	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 100;

	/**
	 * An array of balls.
	 */
	Ball[] balls = new Ball[numBalls];

	/**
	 * The maximum speed on the balls
	 */
	double maxBallSpeed = 8;

	/**
	 * Entry point to the application
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Where the look of the program is setup. Invoked automatically after init.
	 * @param primaryStage The main window that opens on launch.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		//setup the stage
		primaryStage.setTitle("Flying Flashing Balls");
		primaryStage.setResizable(false);		
		
		Canvas canvas = new Canvas(600, 600);
		final GraphicsContext gc = canvas.getGraphicsContext2D();


		//create the balls for the game
		for (int i = 0; i < numBalls; i++) {
			balls[i] = new FlashingBall((int)canvas.getWidth()/2, (int)canvas.getHeight()/2, 0, (int)canvas.getWidth(), 0, (int)canvas.getHeight());
			balls[i].setXSpeed(Math.random() * (maxBallSpeed*2) - maxBallSpeed);
			balls[i].setYSpeed(Math.random() * (maxBallSpeed*2) - maxBallSpeed);
			balls[i].setColor(new Color( Math.random() , Math.random(), Math.random(), 1.0));
		}

		//creates a thread to run the game
		AnimationTimer game = new AnimationTimer() {
			@Override
			public void handle(long timestamp) {
				
				// Repaints the canvas.
				draw(gc);
			}
		};

		//setup the layout for the scene
		StackPane mainPane = new StackPane();
		mainPane.getChildren().add(canvas); //gets the list of all the nodes for the mainPane and adds the canvas to the list
		
		Scene scene = new Scene(mainPane);
		primaryStage.setScene(scene);

		game.start(); //starts the AnimationTimer		
		primaryStage.show();

	}


	/**
	 * Clears the screen and paints the balls.
	 * @param gc The GraphicContext that you want to draw on.
	 */
	public void draw(GraphicsContext gc) {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				//draw background
				gc.setFill(Color.WHITE);
				gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
				//draw objects
				for (int i = 0; i < numBalls; i++) {
					balls[i].draw(gc);
				}
			}

		});
	}

	/**
	 * This method gets called automatically whenever someone clicks the x to close the window or
	 * when Platform.exit() is used in your program to end the application.
	 * This stops all of the balls threads.
	 */
	public void stop() {
		for(int i = 0; i < balls.length; i++) {
			balls[i].stopThread();
		}
	}

}
