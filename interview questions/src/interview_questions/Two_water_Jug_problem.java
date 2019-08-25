package interview_questions;
import java.util.*;

public class Two_water_Jug_problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int d=sc.nextInt();
		//System.out.println("Determine the minimum no of operations to be performed to obtain d litres of water in one of jug");
		System.out.println(minSteps(m, n, d));
		
	}
	public static int minSteps(int m,int n, int d){   // m<n  and d<n   4 58 54
		if(m>n){
			int temp=m;
			m=n;
			n=temp;
		}
		if(d>n){
			return -1;
		}
		if(d% gcd(m,n)!=0){
			return -1;
		}
		
		return Math.min(pour(m,n,d),pour(n,m,d));
	}
	private static int pour(int fromjug, int tojug, int d) {
		// TODO Auto-generated method stub
		int from=fromjug;
		int to=0;
		int step=1;
		
		while(from!=d && to!=d){
			
			int temp=Math.min(from , tojug-to);
			to+=temp;
			from-=temp;
			step++;
			
			if(from==d || to==d){
				break;
			}
			
			if(from==0){
				step++;
				from=fromjug;
			}
			if(to==tojug){
				step++;
				to=0;
			}			
		}
		return  step;
	}
	
	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}

}
