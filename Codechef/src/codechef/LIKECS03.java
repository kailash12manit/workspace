package codechef;

import java.util.Arrays;
import java.util.Scanner;

/*
public void recurse ( array a, int n )
{
	// n = size of array
	define array b currently empty
	consider all 2^n subsets of a[]
	{
		x = bitwise OR of elements in the subsets
		add x into "b" if it is not present yet
	}
	if (sizeof( b ) == 1 << k)
	{
		printf(“Won”);
		return;
	}
	recurse ( b, sizeof( b ) );
}
*/

public class LIKECS03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int []arr= new int[n];
			for(int i=0;i<n;i++){
				arr[i]= sc.nextInt();
			}
			int count=0;
			Arrays.sort(arr);
			for(int i=0;i<arr.length-1;i++){
				if(arr[i+1]-arr[i]>1){
					count++;
				}
			}
			System.out.println(count);
			
		}
	}
	
}
