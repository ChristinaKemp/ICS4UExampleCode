package unit3ExampleCode;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is a console based user interface class representing an 
 * MP3 collection system.
 * @version Sept 2022
 * @author Chistina Kemp
 *
 */
public class ITunes {
	/**
	 * Scanner that can be used throughout the program
	 * to get user input from the system console.
	 */
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Entry point to the program
	 * @param args - unused
	 */
	public static void main(String[] args) {
		int input = 0;
		Mp3Record song = null;
		boolean flag = false;
		
	
		do {
			System.out.println("Welcome! Please make a selection.");
			System.out.println("1 - Add new Record");
			System.out.println("2 - Print Record");
			System.out.println("10 - Quit");
			
			//checks input for numerical values
			do {
				try {
					flag = false;
					input = sc.nextInt();
				}catch(InputMismatchException e) {
					flag = true;
					System.err.println(e.getMessage());
					System.out.println("Please try again!");
				}
			}while(flag);
			
			
			
			sc.nextLine(); //reads the enter after the number from nextInt()
			
			
			if(input == 1) {
				song = createRecord();
			}else if (input == 2) {
				printRecord(song);
			}
			else if(input != 10) {
				System.out.println("That option is invalid, please try again.");
			}
			
		}while(input != 10);

	}

	/**
	 * Prints out the given MP3 record's Song and Artist on a single line
	 * @param r - the MP3 record to print
	 */
	public static void printRecord(Mp3Record r) {
		System.out.println("Song: " + r.getName() + "\t\tArtist: " + r.getArtist());
	}

	
	/**
	 * Creates a new record and sets the name to "Yesterday",
	 * the artist to "Beatles", the composer to "Paul McCartney",
	 * the length to 2.05, and the year to 1965.
	 * @return - this returns an MP3 record with information of Yesterday by the Beatles
	 */
	public static Mp3Record createRecord() {
		
		Mp3Record r = new Mp3Record();
		
		r.setName("Yesterday");
		r.setArtist("Beatles");
		r.setComposer("Paul McCartney");
		r.setLength(2.05);
		r.setYear(1965);
		
		return r;

	}

}
