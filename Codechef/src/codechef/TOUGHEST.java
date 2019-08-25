package codechef;

import java.util.Scanner;

public class TOUGHEST {
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String main_str = sc.next();
			//System.out.println(main_str);
			String []str = main_str.split(" ");
			for(String s:str){
			    	
				//System.out.println("s:"+s);
			    char [] str_char = s.toCharArray();
			    int sum=0;
			    for(int i=0;i<str_char.length;i++){
			    	sum+=(str_char[i]-'0');
			    	//System.out.println(sum);
			    }
			  //System.out.println(sum);
			    if(sum%3==0){
			    	count++;
			    }
			}
		}
		 System.out.println(count);
	}
}