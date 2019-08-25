package codechef;
import java.util.*;
public class CK87QUER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			long y=sc.nextLong();
			int a=1;
		    int b=1;
			int count=0;
			while((a*a+b)<=y){
				
				int tempA=a*a;
				int tempB=b;
				
				while(tempA*tempA+tempB<=y && (tempB<=700)){
					count++;
					tempB++;
				}
				a++;
				
		   }
		System.out.println(count);
		}
	}
}