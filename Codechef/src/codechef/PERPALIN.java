package codechef;
import java.util.*;

public class PERPALIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int p=sc.nextInt();
			if(p==1 || (p==2 && n==2)){
				System.out.println("impossible");
				continue;
			}
			char []temp=new char[n];
			for(int i=0,j=n-1;i<=j;i++,j--){
					if(i%2==0){
						temp[i]='a';
						temp[j]='a';
					}
					else{
						temp[i]='b';
						temp[j]='b';
					}
			}
			for(char c:temp){
				System.out.print(c);
			}
		 	System.out.println();
		 }
	}
}