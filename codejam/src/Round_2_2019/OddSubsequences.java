package Round_2_2019;

import java.util.Scanner;

public class OddSubsequences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int arr[]= new int[n];
			int sum=0;
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					System.out.print(arr[j]+",");
				}
				System.out.println();
			}
		}
	}
}
