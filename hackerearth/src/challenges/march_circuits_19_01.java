package challenges;

import java.math.BigInteger;
import java.util.Scanner;

public class march_circuits_19_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			/*
			int n=sc.nextInt();
			int prosuct_sum=1;
			int sum=0;
			for(int i=1;i<=n;i++){
				prosuct_sum*=i;
				sum+=i;
			}			
			if(prosuct_sum%sum==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			*/
			int n=sc.nextInt();
			BigInteger nn = BigInteger.valueOf(n);
			BigInteger product = BigInteger.ONE;
			BigInteger sum= nn.multiply(nn.add(BigInteger.ONE)).divide(BigInteger.ONE.add(BigInteger.ONE));
			for(int i=1;i<=n;i++){
				product= product.multiply(BigInteger.valueOf(i));
			}			
			if(product.mod(sum).equals(BigInteger.ZERO)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}	
		}		
	}
}
