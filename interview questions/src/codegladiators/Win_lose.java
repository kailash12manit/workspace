package codegladiators;

import java.util.Arrays;
import java.util.Scanner;

public class Win_lose {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			int brr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();  //strengths of Villains.
			}
			for(int i=0;i<n;i++){
				brr[i]=sc.nextInt();   // energy of players.
			}
			Arrays.sort(arr);
			Arrays.sort(brr);
			int flag=1;
			for(int i=0;i<n;i++){
				if(brr[i]>arr[i]){
					continue;
				}
				else{
					flag=2;
					break;
				}
			}
			if(flag==2){
				System.out.println("LOSE");
			}
			else{
				System.out.println("WIN");
			}
		}		
	}	
}
