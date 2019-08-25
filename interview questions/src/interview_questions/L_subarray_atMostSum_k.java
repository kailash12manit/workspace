package interview_questions;

public class L_subarray_atMostSum_k {
	
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 1, 0, 1, 1, 0 };
	    int n = arr.length;
	    int k = 3;
	    int tmp=atMostSum(arr, n, k);
	    if(tmp==n+1){
	    	System.out.println("-1");
	    }
	    else{
	    	System.out.println(tmp);
	    }
	}

	// largest subarray having sum atmost k.  3
	// smallest subarray having sum atleast k.  2
	
	private static int atMostSum(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
	   
		int min_len = n + 1;
        for (int start = 0; start < n; start++)
        {
            int curr_sum = arr[start];
            if (curr_sum >= x)
                return 1;
 
            for (int end = start + 1; end < n; end++)
            {
                curr_sum += arr[end];
 
                if (curr_sum >= x && (end - start + 1) < min_len)
                    min_len = (end - start + 1);
            }
        }
        return min_len;
   }
}