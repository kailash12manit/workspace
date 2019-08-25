package first_round_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine().trim());
		
		while(t-->0) {
			String main_str = sc.nextLine();
			String str[]=main_str.split(" ");
			String arr = str[0];
			int n = Integer.parseInt(str[1]);
			//System.out.println("n:"+n);
			char ch1 = arr.charAt(0);
			int ch2 = arr.charAt(1)-'0';
			
			//System.out.println(ch1+" "+ch2);
			int temp=1;
			switch(ch1) {
				case 'A':
					  temp = (ch2-1)*8+1;
					  break;
				case 'B':
					  temp = (ch2-1)*8+2;
					  break;
				case 'C':
					  temp = (ch2-1)*8+3;
					  break;
					  
				case 'D':
					  temp = (ch2-1)*8+4;
					  break;
				
				case 'E':
					  temp = (ch2-1)*8+5;
					  break;
				
				case 'F':
					  temp = (ch2-1)*8+6;
					  break;
				
				case 'G':
					  temp = (ch2-1)*8+7;
					  break;
				
				case 'H':
					  temp = (ch2-1)*8+8;
					  break;
					  
			}
			//System.out.println("temp:"+temp);
			
			String res1 = find_color(n);
			String res2 = find_color(temp);
			//System.out.println(res1+" : "+res2 );
			if(res1.equals(res2)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}		
		}		
	}

	private static String find_color(int temp) {
		// TODO Auto-generated method stub
		int row=temp/8 + (temp%8==0 ? 0:1);		
		//System.out.println("row:"+row);
		if(row%2==0) {
			//string with white
			int rem = temp%8;
			//System.out.println("rem:"+rem);
			if(rem%2!=0) {
				return "black";
			}
			else {
				return "white";
			}				
		}
		else{
			//string with black
			int rem = temp%8;
			//System.out.println("rem:"+rem);
			if(rem%2!=0) {
				return "white";
			}
			else {
				return "black";
			}			
		}		
	}	
}