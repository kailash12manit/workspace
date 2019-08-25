package DBS;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class findMinRangeWithAllKDistN {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();	
		 while(t-->0){
			 int n=sc.nextInt();
			 int k=sc.nextInt();
			 int arr[]=new int[n];
			 for(int i=0;i<n;i++){
				 arr[i]=sc.nextInt();
			 }
			 int result=minRange(arr,n,k);
			 System.out.println(result);
		 }
	}
	private static int minRange(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		int l=0,r=n;
		for(int i=0;i<n;i++){
			Set<Integer> s = new HashSet<Integer>();
			int j=0;
			for(j=i;j<n;j++){
				s.add(arr[j]);
				if(s.size()==k){
					if((j-i)<(r-l)){
						l=i;
						r=j;					
					}
					break;
				}
			}
			if(j==n){
				break;
			}
		}
		return (r-l+1);	
	}
}
