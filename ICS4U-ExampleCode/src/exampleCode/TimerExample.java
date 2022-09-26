package exampleCode;
import java.util.Timer;
import java.util.TimerTask;

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
