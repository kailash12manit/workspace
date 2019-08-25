package wissen;

import java.util.Scanner;

public class subString_problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(findElement(arr,n));
	}

/*
3
3 4 2
=====
3
3 4
3 4 2
4
4 2
2
*/

	private static void cal_substring(int[] arr) {
		
	}
	 static int findElement(int arr[], int n) 
	    { 
	        int i, j; 
	        int leftsum, rightsum; 
	  
	        /* Check for indexes one by one until  
	           an equilibrium index is found */
	        for (i = 0; i < n; ++i) { 
	  
	            /* get left sum */
	            leftsum = 0;   
	            for (j = 0; j < i; j++) 
	                leftsum += arr[j]; 
	  
	            /* get right sum */
	            rightsum = 0; 
	            for (j = i + 1; j < n; j++) 
	                rightsum += arr[j]; 
	  
	            /* if leftsum and rightsum are same,  
	               then we are done */
	            if (leftsum > rightsum) 
	                return i; 
	        } 
	  
	        /* return -1 if no equilibrium index is found */
	        return -1; 
	 }
}