package interview_questions;

import java.util.Arrays;

public class min_number_which_cannot_formed_using_sets_elements {
	public static void main(String[] args) {
		int arr[]={1,1,2,4,5,6,7};
		Arrays.sort(arr);
		int min=arr[0];
		if(min>1){
			System.out.println("1");
		}
		else{
			for(int i=min+1;i<99999;i++){
				if(groupSum6(0,arr,i)){
					continue;
				}
				else{
					System.out.println(i);
					break;
				}				
			}
		}
	}

	public static boolean groupSum6(int start, int[] nums, int target) {

		if(start>=nums.length) {
			if(target==0) {
				return true;
			}else {
				return false;
			}
		}				
		boolean include = 	groupSum6(start+1,nums,target-nums[start]);
		boolean notInclude = groupSum6(start+1,nums,target);
		return   ( include || notInclude);	    
	}

}
