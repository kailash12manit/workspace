package codechef;
import java.util.*;

public class CK87MEDI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			if(n==k+1){
				System.out.println(arr[k]);
			}else{
				n=n/2-1;
				System.out.println(arr[n+k]);
			}
					
		}
	}

}
