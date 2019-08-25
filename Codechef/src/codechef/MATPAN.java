package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class MATPAN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		sc.nextLine();
		while(t-->0){
			
			int[] price= new int[26];
			for(int i=0;i<26;i++){
				price[i]=sc.nextInt();
			}
			sc.nextLine();
					
			String str= sc.nextLine();
			char[] p2=str.toCharArray();
			int[] charinput= new int[26];
			for (int i = 0; i < p2.length; i++) {
				charinput[p2[i]-'a']++;
			}
			int sum=0;
			for(int i=0;i<26;i++){
				if(charinput[i]<1){
					sum+=price[i];
				}
			}
			System.out.println(sum);
			
		}
		
	}
}
