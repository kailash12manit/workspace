package first_round_2019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem02 {
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			
			String next_line = br.readLine();
			int n=Integer.parseInt(next_line.split(" ")[0]);
			int m=Integer.parseInt(next_line.split(" ")[1]);
			
			int arr[][]= new int[n][n];
			arr = readInput(n);
			readQuery(arr,m);						
		}
		bw.flush();		
	}

	private static void readQuery(int[][] arr, int m) throws IOException {
		// TODO Auto-generated method stub
		int n = arr[0].length;
		StringBuilder sb_row =  new StringBuilder(n);
		StringBuilder sb_col =  new StringBuilder(n);
		
		for(int i=0;i<m;i++) {
			
			String read_input=br.readLine();
		    //System.out.println("read_input:"+read_input);
			
			String []read_arr = read_input.split(" ");
			
			int r1=Integer.parseInt(read_arr[0])-1;
			int c1=Integer.parseInt(read_arr[1])-1;
			int r2=Integer.parseInt(read_arr[2])-1;
			int c2=Integer.parseInt(read_arr[3])-1;
			int value=Integer.parseInt(read_arr[4]);	
			
			for(int j=r1;j<=r2;j++){
				for(int k=c1;k<=c2;k++){
					arr[j][k]+=value;
				}
			}
		
			
		}
		
		/*
		System.out.println("=======1");
			for(int []kk:arr) {
				for(int kk2:kk) {
					System.out.print(kk2+" ");
				}
				System.out.println();
			}
		System.out.println("===========2");
		*/
		for(int k=0;k<n;k++){
			int row_sum=0;
			int col_sum=0;
			for(int j=0;j<n;j++){
				row_sum+=arr[k][j];      // row sum 
				col_sum+=arr[j][k];      // col sum
				
			}
			sb_row.append(String.valueOf(row_sum)+" ");
			sb_col.append(String.valueOf(col_sum)+" ");
		}
		bw.write((sb_row+"\n"+sb_col));
		bw.write("\n");
	}

	private static int[][] readInput(int n) throws IOException {
		// TODO Auto-generated method stub
		int brr[][]= new int[n][n];
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			String []str_Arr = str.split(" ");
			for(int j=0;j<n;j++) {
				brr[i][j]=Integer.parseInt(str_Arr[j]);
			}			
		}
		return brr;
	}
}