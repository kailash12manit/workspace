package codechef;
 
import java.util.Scanner;
 
class CHEFSUM {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int text_case= sc.nextInt();
		while(text_case-->0){
			int N=sc.nextInt();
			int arr[]= new int [N];
			long sum=0;
			for(int i=0;i<N;i++){
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			long prefixsuffix=Long.MAX_VALUE;
			int prefixsuffix_level=0;		
			
			long temppre = 0;
			for(int i=0;i<N;i++){
				temppre+=arr[i];	
				long temp= temppre+sum;
				if(temp<prefixsuffix){
					prefixsuffix=temp;
					prefixsuffix_level=i+1;
				}
				sum-=arr[i];
			}
			System.out.println(prefixsuffix_level);
		}
	}
}