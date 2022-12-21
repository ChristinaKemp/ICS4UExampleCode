package unit3ExampleCode;

/**
 * This makes an MP3 Record
 * @author Christina Kemp
 * @version v.1 Sept 26, 2016
 * @version v.2 October, 2022
 *
 */
public class Mp3Record implements Comparable<Mp3Record> {

	private String name, artist, composer, album;
	private double length;
	private int year;
	
	public Mp3Record() {
		this.name = "";
		this.artist = "";
		this.composer = "";
		this.album = "";
		this.length = 0;
		this.year = 0;
	}
	
	
	public Mp3Record(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.composer = "";
		this.album = "";
		this.length = 0;
		this.year = 0;
	}

	/**
	 * Gets the name of the MP3 track.
	 * @return Returns the name of the MP3 track.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Changes the name of the MP3. 
	 * @param name - The string to set as the name of the track. 
	 */
	public void setName(String name) {		
		this.name = name;
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
	public double getLength() {
		return length;
	}
	
	/**
	 * Sets the length of the track.
	 * @param length The length of the track in minutes and seconds.
	 */
	public void setLength(double length) {
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
	 * Returns a String object representing this Mp3Record's value. 
	 * The result is a string consisting on the name of the song and
	 * the artist, separated by a comma.
	 */
	public String toString() {
		return name + ", " + artist + "\n"
				+ length + "\n";
	}


	@Override
	public int compareTo(Mp3Record o) {

	}


	
}
