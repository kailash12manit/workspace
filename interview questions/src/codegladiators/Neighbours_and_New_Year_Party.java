package codegladiators;

import java.util.Scanner;
import java.util.Arrays;

public class Neighbours_and_New_Year_Party {
	static int s[]= new int[200];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			Arrays.fill(s,0);
			int Integer_on_Ticket[]= new int[n];
			for(int i=0;i<n;i++){
				Integer_on_Ticket[i]=sc.nextInt();
			}
   		    if(n==1){
			        System.out.println(Integer_on_Ticket[0]);
			}
   		    else {
				int k=check(Integer_on_Ticket,s,n);
				//System.out.println("k:"+k);
			    int ma=sum(Integer_on_Ticket,s,n,k);
			    //System.out.println("ma:"+ma);
			    int j=maxv(Integer_on_Ticket,s,ma,n,k);
			    //System.out.println("j:"+j);
			    if(j==0) {
			        System.out.println(ma);
			    }
			}		
		}
	}
	
	public static int check(int Integer_on_Ticket[],int s[],int n) {
	    int m,k=0;
	    for(int i=0;i<(n-2);i++)
	    {
	        for(int j=(i+2);j<n;j++)
	        {
	            s[k]=Integer_on_Ticket[i]+Integer_on_Ticket[j];
	            if(s[k]<Integer_on_Ticket[i])
	            {
	                s[k]=Integer_on_Ticket[i];
	            }
	            k++;
	        }
	    }
	    return k;
	}
	
	public static int sum(int Integer_on_Ticket[],int s[],int n,int k) {
	    int ma=s[0];
	    for(int i=1;i<k;i++) {
	        if(ma<s[i])
	        {
	            ma=s[i];
	        }
	    }
	    return ma;
	}
	
	public static int maxv(int Integer_on_Ticket[],int s[],int ma,int n,int k) {
	    int ans,f=0,p=0,r=0,t=0;
	    int aa=0;
	    int bb=0;
	    
	    for(int i=0;i<(n-2);i++) {
	        for(int j=(i+2);j<n;j++) {
	            ans=Integer_on_Ticket[i]+Integer_on_Ticket[j];
	            if(ans==ma) {
	                if(p==0) {
		                r=i;
		                t=j;
		                f=1;
		                p=1;
		                aa=Integer_on_Ticket[t];
		                bb=Integer_on_Ticket[r];
		                //System.out.println("kk1");
		                //System.out.println(""+Integer_on_Ticket[t]+""+Integer_on_Ticket[r]);
	                }
	                else if(p==1) {
	                          if(Integer_on_Ticket[r]<Integer_on_Ticket[i]) {
	                        	  r=i;
	                         	  t=j;
	                         	  //System.out.println("kk3");
	                         	  p=0;
	                          }
	                        }
	            }
	        }           
	    }	
	    //System.out.println(aa+" -> "+bb);
	    if(f==1){
	        int cc=Integer_on_Ticket[t];
	        int dd=Integer_on_Ticket[r];		
	    	if(cc>aa){
	    		System.out.println(cc+""+dd);
	    	}
	    	else{
	    		System.out.println(aa+""+bb);
	    	}	    	
	    }	    
	    return f;
	}	
}
