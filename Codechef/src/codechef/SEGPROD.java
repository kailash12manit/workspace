package codechef;
import java.util.*;

public class SEGPROD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int p=sc.nextInt();
			int q=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int tt= (int) (Math.floor(q/64)+2);
			int brr[]=new int[tt];
			for(int i=0;i<tt;i++){
				brr[i]=sc.nextInt();
			}
			int x=0;
					
			int Li[]= new int[q];
			int Ri[]= new int[q];
			
			for(int i=0;i<q;i++){
				int result=1;
				if(i%64==0){
					Li[i]=( brr[i/64] + x)%n;
					Ri[i]=( brr[(i/64)+1]+x) %n;
				}else{
					Li[i]=(Li[i-1]+x)%n;
					Ri[i]=(Ri[i-1]+x)%n;
				}
				if(Li[i]>Ri[i]){
					int temp=Li[i];
					Li[i]=Ri[i];
					Ri[i]=temp;
				}
				//System.out.println("Li:"+Li[i]+" Ri: "+Ri[i]);
				for(int start=Li[i];start<=Ri[i];start++){
					result*=arr[start];
					result=result % p;
					//System.out.println("start:"+start+" result: "+result);
				}
				x=(result+1)%p;
				//System.out.println("x: "+x);
			}
			System.out.println(x);
			
		}		
	}
}
