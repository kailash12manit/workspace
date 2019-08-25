package interview_questions;
import java.util.LinkedList;
import java.util.Scanner;

public class digitaldomain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			LinkedList<Integer>ll = new LinkedList<Integer>();
			int n2=n;
			while(n2-->0){
				ll.add(sc.nextInt());
			}
			int middle=0;
			
			if(n%2==1){
				middle = ll.get((n/2));
			}
			else{
				middle = ll.get((n/2)-1) + ll.get(n/2);
			}
			
			int secondPositive=2;
				 for(int num=0; num<ll.size(); num++)
			      {	  if(ll.get(num)==0){
			    		  ll.add(num+1,middle);
			    	  }
			      }
				  for(int num=0; num<ll.size(); num++)
				  {
			          if(ll.get(num)<0){
			      		  ll.remove(num);
			      		  break;
			      	  }			          			      
			      }
				  for(int num=0; num<ll.size(); num++)
			      {
			    	  if(ll.get(num)>0){
			    		  secondPositive--;
			    		  if(secondPositive==0){		    	  
			    			  ll.remove(num);
			    		  }			    		 
			    	  }
			      }
				 for (Integer integer : ll) {
					System.out.print(integer+" ");
				 }
				 System.out.println();
				 
		   }
	}
}