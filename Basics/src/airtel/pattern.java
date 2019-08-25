package airtel;

import java.util.Scanner;


public class pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("printPattern");
		printPattern(n);
		
	}

	private static void printPattern(int n) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		for(i=0;i<n;i++){
			k=1;
			for(j=0;j<n-i;j++){
				System.out.print(" ");
			}
			while(j<=n){
				System.out.print(k+" ");
				k++;
				j++;
			}
			System.out.println();
		}	
	}

}
