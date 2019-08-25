package codechef;

import java.util.Scanner;

public class LIKECS02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			int n=sc.nextInt();
			for(int i=1;i<=n;i++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
