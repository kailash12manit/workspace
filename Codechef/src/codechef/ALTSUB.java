package codechef;

import java.util.Scanner;

public class ALTSUB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int []arr= new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		for(int j=0;j<M;j++){
		    int a=sc.nextInt();
		    if(a==1){
		    	int i= sc.nextInt();
			    int b= sc.nextInt();
			    arr[i-1]=b;
		    }
		    else{
		    	int L= sc.nextInt();
			    int R= sc.nextInt();
			    PooPoo(arr,L-1,R-1);
		     }
		}
	}

	private static void PooPoo(int[] arr, int l, int r) { // 1 2 3 4  [2 3] 1 2
		// TODO Auto-generated method stub
	   int sum=0;
	   for(int i=l;i<=r;i++){
		   for(int j=i;i<=r;i++){
			 sum+= Math.pow(arr[j],2);
		}
	   }			
	}
}
