package interview_questions;
// JAVA code to partition a set into two subsets
// such that the difference of subset sums
// is minimum

public class partition_set_into_two_subsets_min_diff {
	public static void main(String[] args) {
		
		 int arr[] = {3, 1, 4, 2, 2, 1};
	        int n = arr.length;
	        System.out.print("The minimum difference"+
	                        " between two sets is " + 
	                         findMin(arr, n));
	}

	private static int findMin(int[] arr, int n) {
		// TODO Auto-generated method stub
		int totalsum=0;
		for(int i=0;i<n;i++){
			totalsum+=arr[i];
		}
		return findMinRec(arr,n,0,totalsum);
	}

	private static int findMinRec(int[] arr, int i, int sumCalculated, int totalsum) {
		// TODO Auto-generated method stub
		if(i==0){
			return Math.abs((totalsum-sumCalculated)-sumCalculated);
		}
		// For every item arr[i], we have two choices
        // (1) We do not include it first set
        // (2) We include it in first set
        // We return minimum of two choices
		
		return Math.min(findMinRec(arr, i-1, sumCalculated+arr[i-1], totalsum), 
				findMinRec(arr, i-1, sumCalculated, totalsum));
		
	}
}
