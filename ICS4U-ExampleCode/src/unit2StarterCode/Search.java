/**
 * 
 */
package unit2StarterCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Get array values from the user
		System.out.print("How many numbers would you like: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Please enter the numbers one at a time.");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("What value would you like to search for?");
		int num = sc.nextInt();
		
		//sort the array if needed using your Sort class
		//Sort.quick(array);
		int index = linear(array, num);//call your search method here
		System.out.println("Your number, " + num +", was found at index " + index);
		
		sc.close();

	}
	
	/**
	 * Add comments
	 */
	public static int linear(int[] arr, int target) {
		//TODO write the linear search method
		return 0;
	}
	
	/**
	 * Add comments
	 */
	public static int binary(int[] arr, int target) {
		//TODO write the binary search method
		return 0;
	}

}
