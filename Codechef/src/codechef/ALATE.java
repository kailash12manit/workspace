package codechef;

import java.math.BigInteger;
import java.util.Scanner;

class ALATE {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t_case= Integer.parseInt(sc.nextLine());
		while(t_case-->0){
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int []arr= new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		for(int j=0;j<Q;j++){
		    int a=sc.nextInt();
		    int x=sc.nextInt();
		    if(a==1){
		       func(arr,x);
		    }
		    else{
		        int y= sc.nextInt();
		        arr[x-1]=y;
		    }
		}
		}//t_Case
	}//main
	
	private static void func(int[] A, int x)
    {   int N=A.length;
        //System.out.println(N); 
	    BigInteger sum =BigInteger.ZERO;
	    BigInteger largest= new BigInteger("1000000007");
	    
	    for(int i=x-1;i<=N-1;i+=x){
	    	BigInteger a= BigInteger.valueOf(A[i]);
	    	BigInteger b = a.multiply(a).mod(largest);
	    	sum= sum.add(b);
	    }
	    System.out.println(sum.mod(largest));
	    return ;    
    }

}