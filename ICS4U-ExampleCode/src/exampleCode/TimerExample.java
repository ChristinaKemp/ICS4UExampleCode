package exampleCode;
import java.util.Timer;
import java.util.TimerTask;

//This is a simple example of a task that will run every second
//You can also use Timeline, or AnimationTimer classes when dealing with UI in JavaFX

public class TimerExample {
	

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() { 
			public void run() {
				//what to do every 1000 millis
			} 
		}, 0, 1000);
		

	}

}
