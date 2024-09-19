package unit4ExampleCode;

import javafx.scene.canvas.GraphicsContext;

/**
 * This class implements a flashing ball. Feel free to change this, implement a
 * new object, change the animation, etc. <br><br>December 9, 2007.
 * 
 * @author Sam Scott
 * 
 */
public class Ball extends MovingObject {
	/**
	 * The radius of the ball.
	 */
	int radius;

	/**
	 * Calls the superclass constructor, plus sets radius, and flash parameters.
	 * The edges define the box within which the balls will bounce.
	 * 
	 * @param x The x location.
	 * @param y The y location.
	 * @param left The left edge.
	 * @param right The right edge.
	 * @param top The top edge.
	 * @param bottom The bottom edge.
	 */
	public Ball(double x, double y, int left, int right, int top, int bottom) {
		super(x, y, left + 10, right - 10, top + 10, bottom - 10);
		// numbers above must match the radius
		radius = 10;
	}

	/**
	 * Controls the animation parameters. (Called once every time the ball
	 * position is updated.)
	 */
	public void animateOneStep() {
	}

	/**
	 * Draws the ball
	 * 
	 * @param g
	 *            The graphics context.
	 */
	public void draw(GraphicsContext gc) {
		int drawX = (int) x - radius;
		int drawY = (int) y - radius;

		gc.setFill(this.getColor());
		gc.fillOval(drawX, drawY, radius * 2, radius * 2);

	}

}
