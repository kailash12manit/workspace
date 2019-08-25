package coding_interview_practice;
import java.util.*;

public class FizzBuzzClassic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			printNumber(i);
		}
	}

	private static void printNumber(int i) {
		// TODO Auto-generated method stub
		if(i%15==0){
			System.out.println("FizzBuzz");
			return;
		}
		if(i%5==0){
			System.out.println("Buzz");
			return;
		}
		if(i%3==0){
			System.out.println("Fizz");
			return;
		}
		System.out.println(i);
		
	}
}
