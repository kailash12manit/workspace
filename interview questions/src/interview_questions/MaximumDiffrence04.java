package interview_questions;
/*
 * Time Complexity: O(n)
   Auxiliary Space: O(1)
 */

public class MaximumDiffrence04 {
	public static void main(String[] args) 
    {
        MaximumDiffrence04 maxdif = new MaximumDiffrence04();
        int arr[] = {80, 2, 6, 3, 100};
        int size = arr.length;
        System.out.println("MaximumDifference is " + 
                                maxdif.maxDiff(arr, size));
    }
	private int maxDiff(int[] arr, int size) {
		// TODO Auto-generated method stub
		int diff=arr[1]=arr[0];
		int curr_sum=diff;
		int max_sum=curr_sum;
		for(int i=1;i<arr.length-1;i++){
			
			diff=arr[i+1]-arr[i];
			if(curr_sum>0){
				curr_sum+=diff;
			}else{
				curr_sum=diff;
			}
			
			if(curr_sum>max_sum){
				max_sum=curr_sum;
			}
		}
		return max_sum;
	}
}
