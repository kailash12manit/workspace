/**
 * 
 */
package codejam_2018;

import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class Problem_05_New_Language {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		int []arr= new int[5];
		arr[0]=26;
		arr[1]=676;
		arr[2]=19458;
		arr[3]=561990;
		arr[4]=16183020;
		
		for(int i=a-1;i<b;i++){
			sum+=arr[i];
		}					
		System.out.println(sum);
	}
}
