package fxExamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This is an example that draws on the screen using mouse events and key events
 * December 2019
 * @author Christina Kemp
 *
 */
public class PaintGame extends Application {
	
	double x = -1;
	double y = -1;
	Color color = Color.BLACK;
	int brushSize = 50;
	GraphicsContext gc;

	/**
	 * Start of the Application. 
	 * Sets all the GUI elements of the Application.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Game");
		
		VBox layout = new VBox();
		//Group group = new Group();
		Canvas cvs = new Canvas(600,600);
		gc = cvs.getGraphicsContext2D();
		setupCanvas(cvs);

		Label info = new Label("R - Red\tP - Pink\tB - Blue\t G - Green\tV - Violet\tO - Orange\tY - Yellow");
						
		//add canvas to layout
		layout.getChildren().add(info);
		layout.getChildren().add(cvs);
		
		Scene scene = new Scene(layout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * This method adds mouse and key events to the canvas given
	 * @param c
	 */
	public void setupCanvas(Canvas c) {
		c.setFocusTraversable(true);
		c.setOnKeyPressed(event -> {
			System.out.println("Key Pressed" + event.getCode());
			switch(event.getCode()) {
			case R:	color = Color.RED;
				break;
			case G: color = Color.GREEN;
				break;
			case B: color = Color.BLUE;
				break;
			case K: color = Color.BLACK;
				break;
			case Y: color = Color.YELLOW;
				break;
			case P: color = Color.HOTPINK;
				break;
			case O: color = Color.ORANGE;
				break;
			case V: color = Color.DARKVIOLET;
				break;
			case W: color = Color.WHITE;
				break;
			case UP: if (brushSize < 5) brushSize += 1;
				else if(brushSize < 200) brushSize += 5;
				break;
			case DOWN: if(brushSize > 5) brushSize -= 5;
				else if (brushSize > 2) brushSize -= 1;
				break;
			default:
				break;
			}
		});

		c.setOnMouseClicked(event -> {
			System.out.println("Clicked!!!");
			x = event.getX();
			y = event.getY();
			draw(gc);
		});

		c.setOnMouseMoved(event -> {
				//do something for mouse moved
				System.out.println("Position: " + event.getX() + " , " + event.getY());
				if(event.isAltDown()) {
					System.out.println("Alt");
				}
		});
		
		c.setOnMouseDragged(event -> {
				//do something for mouse moved
				System.out.println("Position: " + event.getX() + " , " + event.getY());
				x = event.getX();
				y = event.getY();
				draw(gc);
				if(event.isAltDown()) {
					System.out.println("Alt");
				}		
		});
	}

	
	/**
	 * This method draws a solid red circle
	 * @param gc
	 */
	public void draw(GraphicsContext gc) {
		gc.setFill(color);		
		gc.fillOval(x-25, y-25, brushSize, brushSize);
	}
	
	
	/**
	 * Enrty point to Application
	 * @param args - unused
	 */
	public static void main(String[] args) {
		launch(args);
	}


}
