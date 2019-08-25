package codechef;

import java.util.Scanner;

public class MINPERM {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0){
            int n=scn.nextInt();
            int temp=n;
            if(n%2!=0){
                n=n-2;
            }
            for(int i=2;i<=n;i+=2){
                System.out.print(i+" ");
                System.out.print(i-1+" ");
            }
            if(n%2!=0){
                System.out.print(temp-1+" ");
                System.out.print(temp+" ");
                System.out.print(temp-2+" ");
            }
            System.out.println();
            t--;
        }
	}
}
