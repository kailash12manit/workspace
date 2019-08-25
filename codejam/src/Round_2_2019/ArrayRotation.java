package Round_2_2019;

import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int d=sc.nextInt();
			int matrix[][]= new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=sc.nextInt();
				}
			}
			boolean clockwise=true;
			if(d<0){
				clockwise=false;
				d=d*(-1);
			}
			int times=d/45;
			if(d==0 || d==360){
				times=0;
			}
			while(times-->0){
				matrix=rotateMAtrix(matrix,clockwise);				
			}

			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}				
		}		
	}

	private static int[][] rotateMAtrix(int[][] matrix, boolean clockwise) {
		// TODO Auto-generated method stub
		int n=matrix.length;
		if(clockwise==true){		
			for(int i=0;i<n/2;i++){
				for(int j=0;j<n/2;j++){
					if(i==j){
						int temp=matrix[i][(n/2)];
						
						matrix[i][(n/2)]=matrix[i][j];
						matrix[i][j]=matrix[n/2][j];
						
						matrix[n/2][j]=matrix[n-1-i][j];
						matrix[n-1-i][j]=matrix[n-i-1][n/2];
						
						matrix[n-i-1][n/2]=matrix[n-i-1][n-j-1];
						
						matrix[n-i-1][n-j-1]=matrix[n/2][n-j-1];
						
						matrix[n/2][n-j-1]=matrix[i][n-j-1];
						matrix[i][n-j-1]=temp;
						
					}
				}
			}			
		}
		
		if(clockwise==false){		
			for(int i=0;i<n/2;i++){
				for(int j=0;j<n/2;j++){
					if(i==j){
						int temp=matrix[i][n/2];
						
						matrix[i][n/2]=matrix[i][n-1-j];
						matrix[i][n-1-j]=matrix[n/2][n-1-j];
						
						matrix[n/2][n-1-j]=matrix[n-1-i][n-1-j];
						matrix[n-1-i][n-1-j]=matrix[n-i-1][n/2];
						
						matrix[n-i-1][n/2]=matrix[n-i-1][j];
						matrix[n-i-1][j]=matrix[n/2][j];
						
						matrix[n/2][j]=matrix[i][j];
						matrix[i][j]=temp;
						
					}
				}
			}		
		}
		return matrix;
	}
	
	static void rotate90Clockwise(int a[][],int N) { 
		for (int i = 0; i < N / 2; i++) { 
			for (int j = i; j < N - i - 1; j++){ 
				int temp = a[i][j]; 
				a[i][j] = a[N - 1 - j][i]; 
				a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
				a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
				a[j][N - 1 - i] = temp; 
			} 
		} 
	} 
}
