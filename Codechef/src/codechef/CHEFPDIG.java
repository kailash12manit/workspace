package codechef;

import java.util.HashMap;
import java.util.Scanner;

public class CHEFPDIG {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int test_case=sc.nextInt();
		while(test_case-->0){
			int flag=0;
			String N=sc.next();
			//System.out.println(N);
			char []arr= N.toCharArray(); //  'A':65 to 'Z':90
			for(int i=65;i<=90;i++){
				int j=i%10;  // 5
				int k=i/10;  // 6
									
				if(N.contains(String.valueOf(k)) && N.contains(String.valueOf(j)) ){
					
					if(N.indexOf(String.valueOf(k))!=N.indexOf(String.valueOf(j))){
						//System.out.println((i));
						char c = (char)i;
						System.out.print(c);
					}
					else{
						if(N.indexOf(String.valueOf(k))!=N.lastIndexOf(String.valueOf(j)))
						{
							if(j==6 ){
								System.out.print("B");
							}
							if(j==7){
								System.out.print("M");
							}
							if(j==8){
								System.out.print("X");
							}
						}						
					}//else
										
				}
			}
			System.out.println();
								
		}//test_case
	}
}