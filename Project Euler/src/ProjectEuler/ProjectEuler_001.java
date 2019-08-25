/**
 * 
 */
package ProjectEuler;

import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class ProjectEuler_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n=sc.nextInt()-1;
			long sum=0;
					
			sum=3*sum(n/3)+ 5*sum(n/5)- 15*sum(n/15);
			System.out.println(sum);
		}
	}
	private static long sum(int n){
		long v=n;
		return (v*v+v)>>1;
	}
}
