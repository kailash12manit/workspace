package interview_questions;
import java.util.*;

// GS

public class No_subarrays_product_less_k {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer> ();
		al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add(4);
	    System.out.println(countSubArrayProductLessThanK(al, 10));
	    
	}

	private static int countSubArrayProductLessThanK(ArrayList<Integer> al, int k) {
		// TODO Auto-generated method stub
		int n=al.size();
		long p=1;
		int count=0;
		for(int start=0,end=0; end<n;end++){
			// Move right bound by 1 step Update the product.
			p*= al.get(end);
			
			// Move left bound so guarantee that p is again less than k.
			while(p>=k && start <end){
				p/=al.get(start);
				start++;
			}
			
			// If p is less than k, update the counter.
	        // Note that this is working even for 
	        // (start == end): it means that the 
	        // previous window cannot grow anymore 
	        // and a single array element is the only
	        // addendum.
			
			if(p < k){
				int len= 1+ end-start;
				count+=len;
			}
			
		}
		
		return count;
	}
}
