package interview_questions;
import java.util.Arrays;

public class pair_in_array_with_sum_x {
	public static void main(String[] args) {
		
		int A[] = {1, 4, 45, 6, 10, -8};
		for(int r:A){
			System.out.print(r+" ");
		}
		System.out.println();
        int n = 16;
        System.out.println("Target Sum : "+n);
        int arr_size = 6;
          
        if( hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Array has two "+ 
                         "elements with sum 16");
        else
            System.out.println("Array doesn't have "+
                      "two elements with sum 16 ");
	}

	private static boolean hasArrayTwoCandidates(int[] a, int arr_size, int sum) {
		// TODO Auto-generated method stub
		int l, r;
		Arrays.sort(a);
		l=0;
		r=a.length-1;
		while(l<r){
			if(a[l]+a[r]==sum){
				System.out.print(a[l]+" "+ a[r] +" #:");
				return true;
			}
			if(a[l]+a[r]<sum){
				l++;
			}
			else{
				r--;
			}			
		}
		return false;
	}
}
