package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SEACO {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	    int test_case=sc.nextInt();
		while(test_case-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			int []arr= new int[n+1];
			Arrays.fill(arr, 0);
			
			int [][]input= new int[m][3];
			for (int i = 0; i < m; i++) {
				for(int j=0;j<3;j++){
					input[i][j]=sc.nextInt();
				}
			}
			
			/*
			for (int i = 0; i < m; i++) {
				for(int j=0;j<3;j++){
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
			}
			*/
			for (int i = 0; i < m; i++) {
				for(int j=0;j<3;j++){
					if(j==0){
						if(input[i][0]==1){
												
							int temp1= input[i][1]-1;
							int temp2= input[i][2]-1;
							
							for(int in=temp1;in<=temp2;in++){
								arr[i]++;
							}
							
							
						}
						else { //input[i][0]==2
							
							int temp1= input[i][1]-1;
							int temp2= input[i][2]-1;
								
						}
						
						}// first column j==0
					}
					
			}
			for(int i=0;i<n;n++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}//test_case
	}
}	
	