/**
 * 
 */
package codechef;

import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class BOSSLOSS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase= sc.nextInt();
	    while(tcase -->0){
	    	//N shops
	    	//at least M chocolates
	    	Boolean status= false;
	    	long N= sc.nextInt();
	    	long M=sc.nextInt();
	    	long i=0;
	    	try{
	    	long sum = N*(N+1)/2;
	    	if(sum<M)
	    		status=false;
	    	else
	    		status = true;
	    	for(i=1;i<=N && status==true;i++){
	    		M=M-i;
	    		if(M<=0){
	    			status=true;
	    			break;
	    		}
	    	 }
	    	}catch (Exception e) {
				// TODO: handle exception
			}
	    	
	    	if(status ==true){
	    		System.out.println(i);
	    	}
	    	else System.out.println("-1");
	 	    	
	    }
	}
}
