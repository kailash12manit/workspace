/**
 * 
 */
package freedomjam2017;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class check_subarray_with_given_sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int T= in.nextInt();
		while(T-->0){
			int m=in.nextInt();
			int []arr=new int[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=in.nextInt();
			}
			int n=in.nextInt();
			Arrays.sort(arr);
			int results=0;
		    results=getPairsCount(arr,m,n);
			if(results>0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}
	/*
	public static int getPairsCount(int arr[],int n, int sum){
		for (int i = 0; i < arr.length; i++){
            if(arr[i]==sum){
            	return 1;
            }
			for (int j =i+1 ; j < arr.length; j++){
                if ((arr[i] + arr[j]) == sum)
                    return 1;
			}
		}
		return 0;
	}
	*/
	
	public static int getPairsCount(int arr[],int n, int sum)
    {
		
        HashMap<Integer, Integer> hm = new HashMap<>();
          for (int i=0; i<n; i++){
            if(arr[i]==sum)
            	return 1;
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);
                 
            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int twice_count = 0;
   
        for (int i=0; i<n; i++)
        {
            twice_count += hm.get(sum-arr[i]);
            if (sum-arr[i] == arr[i])
                twice_count--;
        }
   
          return twice_count/2;
    }
}