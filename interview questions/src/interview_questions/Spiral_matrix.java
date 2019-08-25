package interview_questions;
import java.util.*;

//Goldman-Sachs

public class Spiral_matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int matrix[][]= new int [m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		String ans=PrintSpiral(matrix);
		System.out.println("Spiral Form : "+ans);
		
	}

	private static String PrintSpiral(int[][] matrix) {
		// TODO Auto-generated method stub
		String str="[";
		int row=matrix.length;
		int col=0;
		if(row!=0){
			col=matrix[0].length;
		}
		else{
			return "[]";
		}
		int k=0;
		int l=0;
		int i=0;
		
		while(k<row && l<col){
			
			for(i=l;i<col;i++){
				str+=String.valueOf(matrix[k][i]);
				str+=" ";
			}
			k++;
			for(i=k;i<row;i++){
				str+=String.valueOf(matrix[i][col-1]);
				str+=" ";
			}
			col--;
			
			if(k<row){
				for(i=col-1;i>=l;i--){
					str+=String.valueOf(matrix[row-1][i]);
					str+=" ";
				}
				row--;
			}
			
			if(l<col){
				for(i=row-1;i>=k;i--){
					str+=String.valueOf(matrix[i][l]);
					str+=" ";
				}
				l++;
			}
		}
		str=str.trim();
		str+="]";
	
		return str;
	}
}
