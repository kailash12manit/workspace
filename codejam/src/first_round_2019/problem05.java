package first_round_2019;

import java.util.Scanner;

public class problem05 {
	static int ROW;
	static int COL;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			ROW=sc.nextInt();
			COL=sc.nextInt();
			int r=sc.nextInt()-1;
			int c=sc.nextInt()-1;
			int visited[][]= new int[ROW][COL];
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					visited[i][j]=0;
				}
			}
			int res=BFS(visited,r,c,1);
			if(res==0){
				System.out.println("IMPOSSIBLE");
			}
			else{
				System.out.println("YES:"+res);
			}
		}		
	}
	private static int BFS(int[][] visited, int r, int c,int count) {
		// TODO Auto-generated method stub
		if(!(r>=0 && c>=0 && r<ROW && c<COL)){
			return 0;
		}
		if(visited[r][c]==1){
			return 0;
		}
		if(count==(ROW*COL)){
			//System.out.println("count:"+count);
			return count;
		}
		visited[r][c]=1;
		
		int dx[]={-1,0,1,0};
		int dy[]={0,-1,0,1};
		int temp=0;
		for(int i=0;i<4;i++){
			temp=Math.max(temp,BFS(visited,r+dx[i],c+dy[i],count+1));			
		}
		return temp;
	}
}