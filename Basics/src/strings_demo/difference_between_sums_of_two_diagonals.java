package strings_demo;
import java.util.Scanner;
public class difference_between_sums_of_two_diagonals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int leftD=0,rightD=0;
		for(int i=0;i<N;i++){
			for(int j = 0; j < N; j++) {
				int cur=sc.nextInt();
				if(i==j){
					leftD+=cur;
				}
				if(i+j==(N-1)){
					rightD+=cur;
				}
			}
		}
		System.out.println(Math.abs(leftD-rightD));
	sc.close();
	}
}
