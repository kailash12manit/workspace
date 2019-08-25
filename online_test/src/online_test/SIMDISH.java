/**
 * 
 */
package online_test;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Scanner;

/**
 * @author kailash
 *
 */
class Codechef {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int T=kb.nextInt();
		while(T-->0){
			List<String> realWords1 = new ArrayList<String>();
			List<String> realWords2 = new ArrayList<String>();
    		for (int i = 0 ; i < 4 ; i++) {
	           realWords1.add(kb.next());
	        }
			for (int i = 0 ; i < 4 ; i++) {
		       realWords2.add(kb.next());
		    }
			int count=0;
			for(String s:realWords1){
				if(realWords2.contains(s)){
					count++;
				}
			}
			if(count>=2){
				System.out.println("similar");
			}
			else{
				System.out.println("dissimilar");
			}
		}
	}
	
}	