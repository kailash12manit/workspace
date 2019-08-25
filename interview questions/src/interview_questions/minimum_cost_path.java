package interview_questions;
import java.util.*;

public class minimum_cost_path {
	public static int ROW;
	public static int COL;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			ROW=n;
			COL=n;
			int matrix[][]= new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=sc.nextInt();
				}				
			}
			int result= calculateMinPath( matrix,n-1,n-1);
			System.out.println(result);
		}
	}
    
	private static int calculateMinPath(int[][] matrix, int m, int n) {
		// TODO Auto-generated method stub
		if(m<0 || n<0){
			return Integer.MAX_VALUE;
		}
		
		if(m==0 && n==0){
			return matrix[m][n];
		}
		
		return matrix[m][n]+ min( calculateMinPath(matrix,m-1, n) , calculateMinPath(matrix, m-1, n-1),
						calculateMinPath(matrix, m, n-1));
	}

	private static int min(int x, int y, int z) {
		// TODO Auto-generated method stub
		if(x>y){
			return y>z? z:y; 
		}
		else{
			return x>z? z:x;
		}
	}
}