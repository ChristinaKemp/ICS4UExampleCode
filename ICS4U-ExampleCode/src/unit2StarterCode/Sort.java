package unit2StarterCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a starter class for the Sorting Unit. This class will contain all of the methods that will
 * sort a list using various algorithms.
 * Sept 9, 2023
 * @author Christina Kemp
 *
 */
public class Sort {

	// these variables will be used for efficiency testing
	public static int swapCounter;
	public static int loopCounter;
	public static int comparisonCounter;

	/**
	 * The entry point to the program for testing all Sorting methods
	 * @param args unused
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
		System.out.println(Arrays.toString(array)); //prints the unsorted list
			
		bubble(array);//call your sort method here
		
		System.out.println(Arrays.toString(array)); //prints the sorted list
		sc.close();
	}
	
	/**
	 * This method will swap the items at indexes i and j in the given array.
	 * @param arr The array that contains the numbers
	 * @param i The first index to be swapped
	 * @param j The second index to be swapped
	 */
	private static void swap(int[] arr, int i, int j) {
		// TODO swap the items at indexes i and j in the given array.
	}
	
	/**
	 * This method sorts the given array using the bubble sort algorithm
	 * @param arr The array to be sorted
	 */
	public static void bubble(int[] arr) {
		//TODO write the bubble sort method
	}
	
	/**
	 * This method sorts the given array using the insertion sort algorithm
	 * @param arr The array to be sorted
	 */
	public static void insertion(int[] arr) {
		//TODO write the insertion sort method
	}

	/**
	 * This method sorts the given array using the selection sort algorithm
	 * @param arr The array to be sorted
	 */
	public static void selection(int[] arr) {
		//TODO write the selection sort method
	}
	
	/**
	 * This method sorts the given array using the quick sort algorithm.
	 * @param arr The array to be sorted
	 */
	public static void quick(int[] arr) {
		quick(arr, 0, arr.length - 1);
	}
	
	/**
	 * This is a method that is used to recursively sort the given array between
	 * the start and end indices
	 * @param arr The array to be sorted
	 * @param start The first index of the array to be sorted
	 * @param end The last index of the array to be sorted
	 */
	private static void quick(int[] arr, int start, int end) {
		//TODO write the quick sort recursive method
		//base case
		//partition
		//quick left
		//quick right
	}
	
	/**
	 * This method partitions the given array between the start and end indices
	 * and returns the index where the final pivot point finished
	 * @param arr The array to be sorted
	 * @param start The first index of the array to be sorted
	 * @param end The last index of the array to be sorted
	 * @return Returns the index where the pivot is located that divides the list in half
	 */
	private static int partition(int[] arr, int start, int end) {
		//TODO write the partition method
		return 0;
	}
	
	/**
	 * This method sorts the given array using the merge sort algorithm.
	 * @param arr The array to be sorted
	 */
	public static void merge(int[] arr) {
		merge(arr, 0, arr.length - 1);
	}
	
	/**
	 * This is a method that is used to recursively sort the given array between
	 * the start and end indices
	 * @param arr The array to be sorted
	 * @param start The first index of the array to be sorted
	 * @param end The last index of the array to be sorted
	 */
	private static void merge(int[] arr, int start, int end) {
		//TODO write the merge recursive method
		//base case		
		//merge left    start, mid
		//merge right    mid+1, end
		//merging         start, end
	}
	
	/**
	 * This method merges two parts of an array that are currently in order into 
	 * one array that is in order
	 * @param arr The array to be sorted
	 * @param start The first index of the array to be sorted
	 * @param end The last index of the array to be sorted
	 */
	private static void merging(int[] arr, int start, int end) {
		//TODO write the merging method
		return;
	}
	

}
