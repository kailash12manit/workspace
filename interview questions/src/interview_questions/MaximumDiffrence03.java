package interview_questions;
/*
 * Given an array arr[] of integers, find out the difference between any two elements such that
 * larger element appears after the smaller number in arr[].
 */

/*
Time Complexity: O(n)
Auxiliary Space: O(n)
*/

public class MaximumDiffrence03 {
	
	public static void main(String[] args) 
    {
        MaximumDiffrence03 maxdif = new MaximumDiffrence03();
        int arr[] = {80, 2, 6, 3, 100};
        int size = arr.length;
        System.out.println("MaximumDifference is " + 
                                maxdif.maxDiff(arr, size));
    }

	private int maxDiff(int[] arr, int n) {
		// TODO Auto-generated method stub
		int diff[] = new int[n - 1];
		for (int i = 0; i < n - 1; i++)
            diff[i] = arr[i + 1] - arr[i];
		
		// Now find the maximum sum subarray in diff array
        int max_diff = diff[0];
        for (int i = 1; i < n - 1; i++) 
        {
            if (diff[i - 1] > 0) 
                diff[i] += diff[i - 1];
            if (max_diff < diff[i])
                max_diff = diff[i];
        }
        return max_diff;
	}
}
