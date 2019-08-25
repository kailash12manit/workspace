package skillenza_online;
// for capilarry
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class TheLuckyDraw {
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int T= in.nextInt();
		//int []result=new int[T];
		
		int highest=Integer.MIN_VALUE;
		int lowest=Integer.MAX_VALUE;
		int index_of_winner=0;
		int indexof_runner=0;
		
		for(int no_of_participate=0;no_of_participate<T;no_of_participate++){
			int numberInLuckyDraw = in.nextInt();
		
		/*Suppose a participant selects a piece of paper with a number N. Let P be the product of all 
		 *consecutive natural numbers from 1 to N inclusive. Let X be the sum of all the digits of P.
		 *Let Y be the total number of zeroes in P. (The total, not just trailing zeroes!)
		  the participant has to report the value X - Y.
		 */
		BigInteger P = fact(numberInLuckyDraw);
		//System.out.println(P);
		
		String digits = P.toString();
		int sum = 0;
        int zeroes_count=0;
		for(int i = 0; i < digits.length(); i++) {
		    int digit = (int) (digits.charAt(i) - '0');
		    sum = sum + digit;
		    if(digit==0){
		    	zeroes_count++;
		    }
		}
        //System.out.println(sum);
		//System.out.println(zeroes_count);
        int X=sum;
		int Y=zeroes_count;
		
		int report= X-Y;
		if(report>highest){
			highest=report;
			index_of_winner=no_of_participate+1;
		} else if(report<lowest){
			lowest=report;
			indexof_runner=no_of_participate+1;
		}
		//System.out.println(report);
		//result[no_of_participate]=report;
	}
	System.out.println(index_of_winner +" "+highest);
	System.out.println(indexof_runner + " "+lowest);
	

				
	}
	private static BigInteger fact(int n) {
	    BigInteger result = BigInteger.ONE;
	    for (int i = 2; i <= n; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}
}
