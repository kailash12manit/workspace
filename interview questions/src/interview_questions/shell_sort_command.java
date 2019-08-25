package interview_questions;
//All Competitions  Morgan Stanley Campus Codeathon 2017  Order Strings
import java.util.*;

public class shell_sort_command {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		String arr=sc.nextLine();
		String[] arrn=arr.split(" ");
		int arr_len=arrn.length;
		
		String [][]brr= new String[n][arr_len];
		String[] rr= arr.split(" ");
		for(int i=0;i<rr.length;i++){
			brr[0][i]=rr[i];
		}
		for(int i=1;i<n;i++){
			rr=sc.nextLine().split(" ");
			for(int ii=0;ii<rr.length;ii++){
				brr[i][ii]=rr[ii];
			}
		}
		String last=sc.nextLine();
		String[] dd=last.split(" ");
		int col_no=Integer.parseInt(dd[0])-1;
		String order=dd[1];
		String sort_based_on=dd[2];
		/*
		for(String[] ttr:brr){
			for(String tre: ttr){
				System.out.print(tre+" ");
			}
			System.out.println();
		}
		*/
  	    
		if(sort_based_on=="lexicographic"){
			 Arrays.sort(brr, new Comparator<String[]>() {
		            @Override
		            public int compare(final String[] entry1, final String[] entry2) {
		                final String time1 = entry1[col_no];
		                final String time2 = entry2[col_no];
		                return time1.compareTo(time2);
		            }
		        });
	    }
		for(String[] ggt:brr){
			for(String frtg:ggt){
				System.out.println(frtg+" ");
			}
			System.out.println();
		}		
	}
}