/**
 * 
 */
package codejam_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class problem_02_Operations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0,q=0,m=0;
		n=sc.nextInt();
		q=sc.nextInt();
		m=sc.nextInt();
		long []arr= new long[n];
		Arrays.fill(arr, 0);
		while(q-->0){
			char c=sc.next().charAt(0);
			if(c=='a'){
				for(int i=0;i<n;i++){
					arr[i]=arr[i]+i;
				}				
			}
			if(c=='r'){
				int l=sc.nextInt();
				int r=sc.nextInt();
				for(int i=l;i<=r;i++,r--){
					long temp=arr[i];
					arr[i]=arr[r];
					arr[r]=temp;
				}
			}
		}
		int []brr = new int[m];
		for(int i=0;i<m;i++){
			brr[i]=sc.nextInt();
		}		
		for(int t:brr){
			System.out.println(arr[t]+" ");
		}
	}
}