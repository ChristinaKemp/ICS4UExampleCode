package unit2StarterCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a starter class for the Sorting Unit. This class will contain all of the methods that will
 * sort a list using various algorithms.
 * October 13, 2022
 * @author Christina Kemp
 *
 */
public class Sort {
	static long swapCounter = 0;
	static long loopCounter = 0;
	static long comparisonCounter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
	
	public static void bubble(int[] arr) {
		int swaps;
		for(int i = 0; i < arr.length-1; i++) {
//			loopCounter++;
			swaps = 0;
			for(int j = 0; j < arr.length-i-1; j++) {
//				loopCounter++;
//				comparisonCounter++;
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swaps++;
				}
			}
//			comparisonCounter++;
			if(swaps == 0)
				break;
			
		}
	}
	
	
	/**
	 * This method will swap the items at indexes i and j in the given array.
	 * @param arr The array that contains the numbers
	 * @param i The first index to be swapped
	 * @param j The second index to be swapped
	 */
	private static void swap(int[] arr, int i, int j) {
		swapCounter++;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void quick(int[] arr) {
		quick(arr, 0, arr.length - 1);
	}
	
	private static void quick(int[] arr, int start, int end) {
		//base case
		//partition
		//quick left
		//quick right
	}
	
	private static int partition(int[] arr, int start, int end) {
		return 0;
	}
	
	public static void merge(int[] arr) {
		merge(arr, 0, arr.length - 1);
	}
	
	private static void merge(int[] arr, int start, int end) {
		//base case		
		//merge left    start, mid
		//merge right    mid+1, end
		//merging         start, end
	}
	
	private static void merging(int[] arr, int start, int end) {
		
	}
	

}
