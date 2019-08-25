package coding_interview_practice;
import java.util.Scanner;

public class factorial_n {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int input= sc.nextInt();
		//System.out.println(input);
		System.out.println(find_fact(input));
	}

private static long find_fact(int n) {
	// TODO Auto-generated method stub
   long dp[]= new long[n+1];
   dp[0]=1;
   dp[1]=1;
   for(int i=2;i<=n;i++){
	   dp[i]=dp[i-1]*i;
   }
	
	return dp[n];
}

}
