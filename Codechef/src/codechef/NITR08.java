package codechef;
import java.util.*;

public class NITR08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		long res[]= new long[t];
		while(t-->0){
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    long sum=0;
		    int i=0;
		    for(i=l;i<=r;i++){
		    	if(i%2==0 && isDivisible(i)){
		    		break;
		    	}		    	
		    }
		    //System.out.println(i);
		    int j=0;
		    for(j=r;j>=l;j--){
		    	if(j%2==0 && isDivisible(j)){
		    		break;
		    	}		    	
		    }
		    //System.out.println(j);
		    int end=j/6;
		    int start=i/6-1;
		    sum=3*(end*(end+1)-start*(start+1));
		    res[t]=sum;
		}
		for(int i=res.length-1;i>=0;i--){
			System.out.println(res[i]);
		}
	}
	
	private static boolean isDivisible(int i) {
		// TODO Auto-generated method stub
		int digitsum=0;
		while(i>0){
			digitsum+=i%10;
			i=i/10;
		}
		if(digitsum%3==0){
			return true;
		}
		else{
			return false;
		}
	}
}