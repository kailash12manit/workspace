package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RAINBOWA {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		String[]ans=new String[t];
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			int []a=new int[n];
			for(int j=0;j<n;j++)
				a[j]=in.nextInt();
			boolean is=true;
			int s=0,l=a.length-1;
			while(s<=l){
				if(a[s]!=a[l])
					is=false;
				s++;
				l--;
			}
			if(a[n/2]!=7)
				is=false;
			if(is)
				ans[i]="yes";
			else
				ans[i]="no";
		}
		
		for(String an:ans)
			System.out.println(an);
	}

}
