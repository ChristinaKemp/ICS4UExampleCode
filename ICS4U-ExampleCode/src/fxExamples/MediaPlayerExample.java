package fxExamples;
import java.io.File;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MediaPlayerExample extends Application{
		
		Media themeMusic;

		public static void main (String[] args){
			launch(args);
		}
		

		public void init() {
			//load song files at the start 
			//my music is in a folder called resources
			File f = new File("src/resources/dubstep.mp3");
			try {
				themeMusic = new Media(f.toURI().toString());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

		@Override
		public void start(Stage primaryStage) throws Exception {

			//make a player for the music
			MediaPlayer player = new MediaPlayer(themeMusic);
			
			//setting some properties for the player
			player.setAutoPlay(true);
			player.setCycleCount(MediaPlayer.INDEFINITE);
			
	        // Play the media
	        player.play();
			
		} 

}
