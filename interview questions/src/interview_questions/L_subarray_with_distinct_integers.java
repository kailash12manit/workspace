package interview_questions;
import java.util.*;

public class L_subarray_with_distinct_integers {
	public static void main(String[] args) {
		
		int arr[]={1,2,3,1,2,6,1,2,3};
		System.out.println(longestSubarray(arr));
	}

	private static int longestSubarray(int[] arr) {
		// TODO Auto-generated method stub
		int i=0, j=1,max=0,currLength=1;
		HashSet<Integer>set= new HashSet<Integer>();
		set.add(arr[0]);
		
		while( i< arr.length-1 && j<arr.length-1){
			if(!set.contains(arr[j])){
				currLength++;
				set.add(arr[j++]);
			}
			else{
				max= Math.max(max, currLength);
				set.remove(arr[i++]);
				currLength--;			
			}
		}
		return Math.max(max, currLength);
	}
}