package DBS;

import java.util.Scanner;

public class knapsack_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		int total_enery=sc.nextInt();
		int count[]=new int[3];
		int cost[]= new int[3];
		for(int i=0;i<3;i++){
			count[i]=sc.nextInt();			
		}
		for(int i=0;i<3;i++){
			cost[i]=sc.nextInt();			
		}
		int wt[]= {2,3,5};
		int res=knapSack(total_enery,wt,cost,3);
		System.out.println(res);
		*/
		int val[] = new int[]{60, 100, 120}; 
        int wt[] = new int[]{10, 20, 30}; 
	    int  W = 30; 
	    int n = val.length; 
	    System.out.println(knapSack(W, wt, val, n)); 
    }
	
	public static int max(int a, int b) { 
		return (a > b)? b : a; 
	} 
      
    // Returns the maximum value that can be put in a knapsack of capacity W 
    public static int knapSack(int W, int wt[], int val[], int n) { 
       // Base Case 
    	if (n == 0 || W == 0) 
    		return 0; 
      
	   // If weight of the nth item is more than Knapsack capacity W, then 
	   // this item cannot be included in the optimal solution 
	   if (wt[n-1] > W) { 
	      return knapSack(W, wt, val, n-1); 
	   }
	   // Return the maximum of two cases:  
	   // (1) nth item included  
	   // (2) not included 
	   else {
		   return max( val[n-1] + knapSack(W-wt[n-1], wt, val, n-1), knapSack(W, wt, val, n-1) ); 
	    }
    }
}