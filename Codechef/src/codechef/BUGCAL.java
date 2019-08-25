package codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BUGCAL {
	 
	public static void main(String args[]) throws IOException{
	
		int i=0,j=0,large=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		  String[] arr = br.readLine().split(" ");
		  //int x = Integer.parseInt(arr[0]);  
		  //int y = Integer.parseInt(arr[1]);
		  
	      String[] x = arr[0].split("");
	      String[] y = arr[1].split("");
	      
	      StringBuilder sb = new StringBuilder("");
	      if(x.length>y.length){
	    	  i=x.length-1;
	    	  j=y.length-1;
	    	  for(i=i;j>=0;i--,j--){
	    	    	
	    	    	int temp = Integer.parseInt(x[i])+Integer.parseInt(y[j]);
	    	    	String s = String.valueOf(temp); 
	    	    	sb = sb.append(s.charAt(s.length()-1));
	    	  }
	    	  for(i=i;i>=0;i--){
	    	    sb.append(x[i]);	 
	          }
	      }
	      else{
	    	  i=y.length-1;
	    	  j=x.length-1;
	    	  for(i=i;j>=0;i--,j--){
	    	    	
	    	    	int temp = Integer.parseInt(y[i])+Integer.parseInt(x[j]);
	    	    	String s = String.valueOf(temp); 
	    	    	sb = sb.append(s.charAt(s.length()-1));
	    	  }
	    	  for(i=i;i>=0;i--){
	    	    sb.append(y[i]);	 
	          }
	      }
	      String res = sb.reverse().toString();
	      int xy = Integer.parseInt(res);
	      System.out.println(xy);
		 }
	  }
	 }