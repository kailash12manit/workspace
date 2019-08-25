package DEC18B;

import java.util.Scanner;

public class CHFINTRO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		while(n-->0){
			int rr= sc.nextInt();
			if(rr>=r){
				System.out.println("Good boi");
			}
			else{
				System.out.println("Bad boi");
			}			
		}		
	}
}
