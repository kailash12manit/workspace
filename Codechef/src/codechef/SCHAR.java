/**
 * 
 */
package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class SCHAR {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcase = Integer.parseInt(br.readLine());
 
		while(tcase-->0){
			int cost=0;
			String str= br.readLine();
			
			char[] arr = str.toCharArray();
			
			for(int i=0;i<str.length();i++){
				int cost_i_to_j = 0;
			    char s= arr[i];
			    for(int j=i+1;j<str.length();j++){
			    	if(s==arr[j]){
			    		cost_i_to_j = 0;
			    		i=j;
			    	}
			    	else{
			    		cost_i_to_j= Math.abs(arr[i]-arr[i+1]);
			    	}
			    }
			    cost+=cost_i_to_j;
			 }				
			System.out.println(cost);
		}
	}
}
