package codechef;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class LIKECS01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			String str=sc.nextLine();
			//System.out.println(str);
			char[] arr= str.toCharArray();
			
			int []count= new int[26];
			Arrays.fill(count, 0);
			for(int i=0;i<str.length();i++){
				char c= arr[i];
				count[c-'a']++;
			}
			int flag=0;
			for(int var:count){
				//System.out.print(var+" ");
				if(var>=2){
					flag=1;
					break;
				}
			}
			if(flag==1){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}	
	}
}
