package OCT18B;

import java.util.Scanner;

public class CHSERVE {
	public static void main(String[] args) {
		int t,n,d;
		Scanner sc = new Scanner(System.in);
		t= sc.nextInt();
		while(t-->0){
			int p1=sc.nextInt();
			int p2=sc.nextInt();
			int k=sc.nextInt();
			
			int sum=p1+p2;
			int complete_round = sum/k;
			if(sum%k==0){
				if(complete_round%2==0){
					System.out.println("CHEF");
				}else{
					System.out.println("COOK");
				}
			}else{
				complete_round++;
				if(complete_round%2==0){
					System.out.println("COOK");
				}else{
					System.out.println("CHEF");
				}
			}
		}
	}
}
