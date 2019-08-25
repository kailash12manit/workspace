/**
 * 
 */
package codejam_2018;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class problem_03_Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> row=new ArrayList<Integer>();
		ArrayList<Integer> col=new ArrayList<Integer>();
		int t=n;
		for(int i=0;i<n;i++){
			row.add(sc.nextInt());
			col.add(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			if(i==0){
				System.out.println(row.indexOf(i)*col.indexOf(i));
		 	}
	    	else{
	    		for(int j=0;j<i;j++){
	    					    	
			    	
			    }    		
	    	}
			
		}
	}
}