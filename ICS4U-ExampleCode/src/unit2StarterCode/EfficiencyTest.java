package unit2StarterCode;

/**
 * Code to test the efficiency of searching and sorting code.
 * October 13, 2022
 * @author C Kemp
 *
 */
public class EfficiencyTest {

	public static void main(String[] args) {
		
		//n is the number of items in the array
		for(int n = 1000; n <= 30000; n += 1000) {
			int[] arrBest = new int[n];
			int[] arr = new int[n];
			int[] arrWorst = new int[n];
			long elapsed = 0;
			int trials = 50;
			for(int x = 0; x < trials; x++) {	
				
				//filling array with random numbers between 0 and 10000
				for(int i = 0 ; i < n; i++) {
					arrBest[i] =  i; //best case for Sorting
					arrWorst[i] = 2*n-2*i; //worst case 
					arr[i] = (int)(Math.random() * n); //average case for Sorting
				}

				//int target = (int)(Math.random() * n); //average case for Searching
				//Searching Best Case: Target is first num that get's looked at (mid or item 0)
				//Searching Worst Case: Target is not in list (any negative number)
				
				long start = System.nanoTime();
				Sort.bubble(arrWorst); //change this to what you want to test
				long end = System.nanoTime();
				elapsed += end-start; //totals all the elapsed times		
			}

			System.out.println(elapsed/trials + "\t" + Sort.swapCounter/trials + "\t" + Sort.loopCounter/trials + "\t" + Sort.comparisonCounter/trials);
			Sort.swapCounter = 0;
			Sort.loopCounter = 0;
			Sort.comparisonCounter = 0;
		}
	}

}
