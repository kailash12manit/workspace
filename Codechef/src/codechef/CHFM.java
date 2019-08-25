package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class CHFM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(CalstealCoin(arr));
		}		
	}

	private static String CalstealCoin(int[] arr) {
		// TODO Auto-generated method stub
		String ans = "Impossible";
		int n=arr.length;
		ArrayList<Double>al = new ArrayList<Double>();
		long sum=0;
		for(int num:arr){
			al.add((double) num);
			sum=sum+num;
		}
		//System.out.println(sum);
		double val=(((double)sum/n)*(n-1));
		//System.out.println(val);
		double val2=sum-val;
		//System.out.println(val2);
		//System.out.println(al);
		if(al.contains(val2)){
			return String.valueOf(al.indexOf(val2)+1);
		}
		return ans;
	}
}
