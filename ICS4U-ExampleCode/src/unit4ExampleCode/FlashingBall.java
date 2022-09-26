package unit4ExampleCode;

import javafx.scene.paint.Color;

import javafx.scene.canvas.GraphicsContext;

/**
 * This class implements a flashing ball. Feel free to change this, implement a
 * new object, change the animation, etc. <br><br>December 9, 2007.
 * 
 * @author Sam Scott
 * 
 */
public class FlashingBall extends Ball {
	/**
	 * Counts the frames between flash on/off.
	 */
	int counter;
	/**
	 * The number of frames to wait before toggling the flash.
	 */
	int flashSpeed;
	/**
	 * Controls the flash - true if the ball is filled in, false if it is an
	 * outline.
	 */
	boolean filledIn;

	/**
	 * Calls the superclass constructor, plus sets radius, and flash parameters.
	 * 
	 * @param x
	 *            The x location.
	 * @param y
	 *            The y location.
	 * @param left
	 *            The left edge.
	 * @param right
	 *            The right edge.
	 * @param top
	 *            The top edge.
	 * @param bottom
	 *            The bottom edge.
	 */
	public FlashingBall(double x, double y, int left, int right, int top, int bottom) {
		super(x, y, left, right, top, bottom);
		counter = 0;
		flashSpeed = (int) (Math.random() * 5 + 5);
		filledIn = true;
	}

	/**
	 * Controls the animation parameters. (Called once every time the ball
	 * position is updated.)
	 */
	public void animateOneStep() {
		counter++;
		if (counter == flashSpeed) {
			counter = 0;
			if (filledIn)
				filledIn = false;
			else
				filledIn = true;
		}
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

		gc.setFill(color);
		gc.fillOval(drawX, drawY, radius * 2, radius * 2);
		if (!filledIn) {
			gc.setFill(Color.WHITE);
			gc.fillOval(drawX + radius / 2, drawY + radius / 2, radius, radius);
		}

	}
}
