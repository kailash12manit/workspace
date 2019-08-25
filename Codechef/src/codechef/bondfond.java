/**
 * 
 */
package codechef;

import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class bondfond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		long t=sc.nextInt();
		while(t-->0){
			long min=Long.MAX_VALUE;
			long N=sc.nextLong();
			for(int i=0;i<10;i++){
				long temp=(long) Math.abs(N- Math.pow(2, i ));
				if(min>temp){
					min=temp;
					
				}
			}
		System.out.println(min);	
		}
	}

	
}
