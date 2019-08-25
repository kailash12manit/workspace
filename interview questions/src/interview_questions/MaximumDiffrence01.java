package interview_questions;
/*
 * Given an array arr[] of integers, find out the difference between any two elements such that
 * larger element appears after the smaller number in arr[].
 * /*
Time Complexity: O(n^2)
Auxiliary Space: O(1)
*/

public class MaximumDiffrence01 {
	public static void main(String[] args) {
		
		MaximumDiffrence01 maxdif = new MaximumDiffrence01();
	        int arr[] = {1, 2, 90, 10, 110};
	        System.out.println("Maximum differnce is " + 
	                                maxdif.maxDiff(arr, 5));
	}

	private int maxDiff(int[] arr, int arr_length) {
		// TODO Auto-generated method stub
		int max_diff=arr[1]-arr[0];
		int i,j;
		
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[j]-arr[i]>max_diff){
					max_diff= (arr[j]-arr[i]);
				}
			}
		}
		return max_diff;	
	}
}