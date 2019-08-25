package interview_questions;
import java.util.Scanner;

public class Smallest_subarray_with_sum_greater_than_x {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
		while(cases-->0){
			 
			 int size = scan.nextInt();
			 int num = scan.nextInt();
			 int s=0;
			 int[] sum = new int[size];
			 int i=0;
			 for(;i<size;i++)
			 {
			     s += scan.nextInt();
			     sum[i] = s;
			 }
			 
			 System.out.println(subarraySum(sum,size,num));
		}
	}
	
	public static int subarraySum(int a[],int n,int x)
	{
	    int start=0,end=0; int cursum=0;int minlen=n+1;
	    
	    while(end<n)
	    {
	        while (cursum <= x && end < n)
	        cursum+=a[end++];
	        
	        while(cursum>x&&start<n)
	        {
	        if(end-start<minlen)
	        minlen=end-start;
	        cursum-=a[start];
	        start++;
	        }
	    }
	   return minlen;
	}
}