package exampleCode;

// ****************************
// These lines have to be here. Cut and paste them into your code
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * This file is an example of how to play a sound in Java. 
 * 
 * Created September 8, 2008. 
 * Modified April 5, 2016. 
 * 
 * @author Christina Kemp
 **/
public class AudioExample{

	public static void main (String[] args) throws InterruptedException{

		// *****************************
		// THESE LINES CREATE THE CLIP TO PLAY THE MUSIC. 
		// Cut and paste them into your program, and change "theme.wav"
		// to the sound you want to play. 
		
		Clip theme = null;
		try {
			
			// *****************************
			// THESE LINES CREATE THE CLIP TO PLAY THE MUSIC. 
			// Cut and paste them into your program, and change "theme.wav"
			// to the sound you want to play. 
			theme = AudioSystem.getClip(); //create the clip object
			theme.open(AudioSystem.getAudioInputStream(new File("src/exampleCode/theme.wav"))); //open the given file for the clip

			System.out.println("OK, here comes some music!");
			Thread.sleep(1000);

			// ************************
			// Include this line when you want the sound to start playing.
			theme.start();
			// Instead of using start you could alternatively use the loop function.
			// The following line will loop your music until stop is called.
//			 theme.loop(Clip.LOOP_CONTINUOUSLY);
			// ************************

			// THE PROGRAM CONTINUES WHILE THE MUSIC PLAYS
			Thread.sleep(5000);
			System.out.println("Hope you like it!");
			Thread.sleep(500);
			
			
			// ************************
			// Include this line when you want the sound to stop playing.
			theme.stop();
			// ************************

			Thread.sleep(1000);
			System.out.println("Goodbye");  

		} catch (Exception e) {
			System.out.println("There was an error loading the music.");
			e.printStackTrace(); // this error message will tell you what exception was thrown and from what line
		}

		System.out.println("OK, here comes some music!");
		Thread.sleep(1000);

		// ************************
		// Include this line when you want the sound to start playing.
		theme.start();
		
		// Instead of using start you could alternatively use the loop function: 
		//			 theme.loop(Clip.LOOP_CONTINUOUSLY);    //loop your music until stop is called.
		//			 theme.loop(3);							//loops three times
		// ************************

		// THE PROGRAM CONTINUES WHILE THE MUSIC PLAYS
		Thread.sleep(5000);
		System.out.println("Hope you like it!");
		Thread.sleep(500);


		// Include this line when you want the sound to stop playing.
		theme.stop();

		Thread.sleep(1000);
		System.out.println("Goodbye"); 
		
		Thread.sleep(2000);

	} // main method
} 

