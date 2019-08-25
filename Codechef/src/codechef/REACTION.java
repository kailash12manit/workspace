package codechef;

import java.util.Scanner;

public class REACTION {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int r=sc.nextInt();
			int c=sc.nextInt();
			int u=1;
			int matrix[][]= new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					int temp=sc.nextInt();
					int count=4;
		            if(j==0 || j==c-1)
		             count--;
		            if(i==0 || i==r-1)
		             count--;
		            if(count<=temp) {
		            	u=2;
		            	break;
		            }
				}
			}
			if(u==1){
				System.out.println("Stable");
			}
			else{
				System.out.println("Unstable");
			}
		}				
	}
}