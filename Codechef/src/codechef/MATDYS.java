package codechef;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MATDYS {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int t=sc.nextInt();
		   while(t-->0){
		      long k=sc.nextInt();
		      String n=sc.next();
		      BigInteger a=new BigInteger(n);
		      //System.out.println("a:"+a);
		      String ans=a.toString(2);
		      //System.out.println("ans:"+ans);
		      int l=ans.length();
		      //System.out.println("l:"+l);
		      
		      for(int i=0;i<k-l;i++){
		    	  ans="0"+ans;
		      }
		      //System.out.println("ans2:"+ans);
		      StringBuffer b=new StringBuffer(ans);
		      b.reverse();
		      //System.out.println(b);
		      BigInteger c=new BigInteger(b.toString(),2);
		      System.out.println(c);
		   }
	}	
}					
