package interview_questions;
import javax.management.MXBean;

/*
 * Given an array arr[] of integers, find out the difference between any two elements such that
 * larger element appears after the smaller number in arr[].
 * /*
Time Complexity: O(n)
Auxiliary Space: O(1)
*/

public class MaximumDiffrence02 {
	public static void main(String[] args){
		
        MaximumDiffrence02 maxdif = new MaximumDiffrence02();
        int arr[] = {1, 2, 90, 10, 110};
        int size = arr.length;
        System.out.println("MaximumDifference is " + 
                                maxdif.maxDiff(arr, size));
    }
	private int maxDiff(int[] arr, int size) {
		// TODO Auto-generated method stub
		int max_diff=arr[1]-arr[0];
		int min_element=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]-min_element> max_diff){
				max_diff=(arr[i]-min_element);
			}
			if(arr[i]<min_element){
				min_element=arr[i];
			}
		}
		return max_diff;
	}
}


/*
int maxDiff(int arr[], int n)
{
    int maxDiff = -1; // Initialize Result
 
    int maxRight = arr[n-1]; // Initialize max element from right side
 
    for (int i = n-2; i >= 0; i--)
    {
        if (arr[i] > maxRight)
            maxRight = arr[i];
        else
        {
            int diff = maxRight - arr[i];
            if (diff > maxDiff)
            {
                maxDiff = diff;
            }
        }
    }
    return maxDiff;
}

*/