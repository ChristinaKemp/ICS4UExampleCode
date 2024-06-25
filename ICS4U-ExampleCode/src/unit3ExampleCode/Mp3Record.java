package unit3ExampleCode;

/**
 * This makes an MP3 Record
 * @author Christina Kemp
 * @version v.1 Sept 26, 2016
 * @version v.2 October, 2022
 *
 */
public class Mp3Record implements Comparable<Mp3Record> {

	private String songTitle, artist, composer, album, length;
	private double bitRate;
	private int year;
	
	/**
	 * Creates a new Mp3Record with empty fields.
	 */
	public Mp3Record() {
		this.setSongTitle("");
		this.setArtist("");
		this.setComposer("");
		this.setAlbum("");
		this.setLength("0:00");
		this.setYear(0);
	}
	
	/**
	 * Creates a new MP3Record with the given name and artist
	 * @param songTitle
	 * @param artist
	 */
	public Mp3Record(String songTitle, String artist) {
		this.setSongTitle(songTitle);
		this.setArtist(artist);
		this.setComposer("");
		this.setAlbum("");
		this.setLength("0:00");
		this.setYear(0);
	}

	/**
	 * Gets the song title of the MP3 track.
	 * @return Returns the name of the MP3 track.
	 */
	public String getSongTitle() {
		return songTitle;
	}
	
	/**
	 * Changes the song title of the MP3. 
	 * @param songTitle - The string to set as the title of the track. 
	 */
	public void setSongTitle(String songTitle) {		
		this.songTitle = songTitle;
	}
	
	/**
	 * This method returns the name of the artist for the given track.
	 * @return Returns the artist of the MP3 track.
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * Sets the artist for the MP3 track.
	 * @param artist The name of the artist.
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/**
	 * This method returns the composer the given track.
	 * @return Returns the composer of the MP3 track.
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * Sets the composer for the track.
	 * @param composer The name of the composer.
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	/**
	 * This method returns the length of the given track.
	 * @return Returns the length of the MP3 track.
	 */
	public String getLength() {
		return length;
	}
	
	/**
	 * Sets the length of the track.
	 * @param length The length of the track in minutes and seconds.
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * This method returns the year the given track was released.
	 * @return Returns the release year of the MP3 track.
	 */
	public int getYear() {
		return year;
	}



	/**
	 * Sets the release year for the MP3 track.
	 * @param year Sets the year for the MP3 track.
	 * @throws InvalidInputException
	 */
	public void setYear(int year){
		this.year = year;
	}
	
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}

	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}

	/**
	 * @return the bitRate
	 */
	public double getBitRate() {
		return bitRate;
	}

	/**
	 * @param bitRate the bitRate to set
	 */
	public void setBitRate(double bitRate) {
		this.bitRate = bitRate;
	}

	/**
	 * Returns a String object representing this Mp3Record's value. 
	 * The result is a string consisting on the name of the song and
	 * the artist, separated by a comma.
	 */
	public String toString() {
		return "[" + songTitle + ", " + artist + ", " + length + ", " + year + "]";
	}


	/**
	 * Sorts by artist first, then by song title
	 * @param r The mp3Record to be sorted
	 * @return the value representing which mp3Record comes before/after the 
	 */
	@Override
	public int compareTo(Mp3Record r) {
		if(this.artist.compareTo(r.getArtist()) == 0) {
			return this.songTitle.compareTo(r.getSongTitle());			
		}
		else
			return this.artist.compareTo(r.getArtist());


			
	}




	
}
