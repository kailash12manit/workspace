package first_round_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class problem02_3 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int row_sum[]=new int[n];
			int col_sum[]=new int[n];
						
			for(int i=0;i<n;i++){
				int row_temp=0;
				for(int j=0;j<n;j++){
					int temp = sc.nextInt();
					col_sum[j]=col_sum[j]+temp;
					row_temp+=temp;
	  			}
				row_sum[i]=row_temp;
			}
			
			while(m-->0){
				int r1=sc.nextInt()-1;
				int c1=sc.nextInt()-1;
				int r2=sc.nextInt()-1;
				int c2=sc.nextInt()-1;
				int value=sc.nextInt();	
				
				for(int i=r1;i<=r2;i++){
					row_sum[i]=row_sum[i]+(value*(c2-c1+1));
				}
								
				for(int i=c1;i<=c2;i++){
					col_sum[i]=col_sum[i]+(value*(r2-r1+1));
				}
			}// while END
			
			for(int kk:row_sum){
				System.out.print(kk+" ");
			}
			
			System.out.println();
			for(int kk:col_sum){
				System.out.print(kk+" ");
			}
			if(t>1){
				System.out.println();
			}			
		}			   
	}
}