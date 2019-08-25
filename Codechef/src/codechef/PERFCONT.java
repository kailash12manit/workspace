package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class PERFCONT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int p=sc.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int difficulty[]= new int[2]; //  0-:hard , 1 : cakewalk
			Arrays.fill(difficulty,0);
			for(int i=0;i<n;i++){
				if(arr[i]>=((int)p/2)){
					difficulty[1]++;
					
				}else if( arr[i] <= (int)(p/10)){
					difficulty[0]++;
				}
			}
			if(difficulty[0]==2 && difficulty[1]==1){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}	
						
		}
	}

}
