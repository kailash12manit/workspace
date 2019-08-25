package coding_interview_practice;
import java.util.*;
import java.lang.*;

public class FibonacciLite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(CalnthTerm_fibo(n));
	}

	private static long CalnthTerm_fibo(int n) {
		// TODO Auto-generated method stub
		if(n<=1){
			return n;
		}
		return CalnthTerm_fibo(n-1)+ CalnthTerm_fibo(n-2);
		
	}
}
