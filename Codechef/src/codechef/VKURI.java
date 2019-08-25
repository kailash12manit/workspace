package codechef;

import java.util.Scanner;

public class VKURI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		int count=0;
		for(long i=1;i<=n;i++){
			if(i<=n){
				//System.out.print(n+" ");
				n=n-i;
				count++;
			}else{
				break;
			}
		}
		System.out.println(count);
			
	}
}
