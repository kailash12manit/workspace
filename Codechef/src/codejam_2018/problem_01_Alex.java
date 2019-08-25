/**
 * 
 */
package codejam_2018;

import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class problem_01_Alex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // number of missing cards, n
		int min=0;
		int max=0;
		int remaining= 52-n;  // number of remaining cards
		max=remaining/5;
		if(max>8) {
			max=8;
		}
		remaining = remaining-26;
		if(remaining<=0) {
			min=0;
		}
		else if(remaining<9) {
				if(remaining%2==0) {
					min=remaining/2;
				}else {
					min=(remaining+1)/2;
				}			
	    }
		else if(remaining<13) {
			min=5;
		}
		else if(remaining<18) {
			min=6;
		}
		else if(remaining<22) {
			min=7;
		}else {
			min=8;
		}
		
		System.out.println(min+" "+max);
	}
}
