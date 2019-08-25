package interview_questions;
/*
 * 	// Java program to find subarray having
   	// maximum sum less than or equal to sum
 */

import java.util.ArrayList;

public class Maximum_subarrays_sum_less_k {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer> ();
		al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add(4);
	    al.add(5);
	    
	    int sum=11;
	    System.out.println(findMaxSubarraySum(al,sum));
	}

	private static int findMaxSubarraySum(ArrayList<Integer>al,int sum) {
		// TODO Auto-generated method stub
		int max_sum=0,start=0;
		int n=al.size();
		
		int curr_sum=al.get(0);
			
		for(int i=1;i<n;i++){
			
			// If curr_sum becomes greater than
            // sum subtract starting elemetns of array
			
			while(curr_sum>sum && start <i){
				curr_sum-=al.get(start);
				start++;
			}
			
			// Update max_sum if it becomes
            // greater than curr_sum
			max_sum=Math.max(max_sum, curr_sum);
			
			// Add elements to curr_sum
			curr_sum+=al.get(i);
		}
		
		// Adding an extra check for last subarray
		if (curr_sum <= sum){
            max_sum =  Math.max(max_sum, curr_sum);
		}
		
		return max_sum;		
	}
}